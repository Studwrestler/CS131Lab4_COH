//IO TestClass for bad file names
public class BadFileName {

	public static void main(String[] args) {

		FileProcessor fp = new FileProcessor("BadString.txt", 10);
		System.out.println("File Name: "+fp.getFileName());
		System.out.println("String length: "+fp.getStringLength());
		fp.processFile();
		
		
	}// end main

}// end class
