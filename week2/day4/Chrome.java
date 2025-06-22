package week2.day4;

public class Chrome extends Browser{
	public void openIncognito(){
		 System.out.println("Incognito Mode");
	 }
	 public void clearCache() {
	 System.out.println("Cache was cleared");
	 
	 }
public static void main(String[] args) {
	Browser c = new Browser();
	c.browserName="Chrome";
	c.browserVersion="10.4";
	c.closeBrowser();
	c.navigateBack();
	c.openURL();
}
}
