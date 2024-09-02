package day17_intercept_network;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.fetch.Fetch;

public class Intercept_Network {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request -> {
			if (request.getRequest().getUrl().contains("shetty")) {
				String newUrl = request.getRequest().getUrl().replace("=shetty", "BadGuy");
				System.out.println(newUrl);
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						java.util.Optional.empty()));
			} else {
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						java.util.Optional.empty()));
			}

		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.findElement(By.xpath("//h2[text()='Books Availability in Rahul Shetty Academy Library']")).getText()	;
	}

}
