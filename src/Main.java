import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Main {
	
		public static void main(String[] args) {
		File imageFile = new File("C:\\images\\newport23_screenshot.png");
		@SuppressWarnings("deprecation")
		Tesseract instance = Tesseract.getInstance(); //
		instance.setDatapath("C:\\Users\\mallickh\\workspace\\Tessract\\Tess4J\\tessdata");
		 
		try {
		 
		String result = instance.doOCR(imageFile);
		System.out.println(result);
		 
		} catch (TesseractException e) {
		
		System.err.println(e.getMessage());
		}
		}

}
