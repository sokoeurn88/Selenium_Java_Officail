//package screen_recording;
//
//import java.awt.AWTException;
//import java.awt.GraphicsConfiguration;
//import java.awt.Rectangle;
//import java.io.File;
//import java.io.IOException;
//
//import org.monte.media.Format;
//import org.monte.media.Registry;
//import org.monte.screenrecorder.ScreenRecorder;
//
///* this code is not working now. */
//
//
//
//public class ScreenRecorderUtil extends ScreenRecorder  {
//	
//	public static ScreenRecorder screenRecorder;
//	public String name;
//	
//	public ScreenRecorderUtil(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder, String name) throws IOException, AWTException 
//	{
//		super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
//		this.name = name;
//	
//	}
//	
//	protected File createMovieFile(Format fileFormat) throws IOException {
//		if(!movieFolder.exists()) {
//			movieFolder.mkdir();
//		} else if(!movieFolder.isDirectory()) {
//			throw new IOException("\""+movieFolder+"\" is not a directory.");
//		}
//		SimpleDataFormat dateFormat = new SimpleDataFormat("yyyy-MM-dd HH.mm.ss");
//		return new File(movieFolder, name + "-"+ dateFormat.form(new Data())+"." + Registry.getInstance().getExtension(fileFormat));
//		
//	}
//	
//	
//
//	 
//	 
//
//}
