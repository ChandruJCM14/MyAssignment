package week1.day3;

public class Browser {

	String	launchBrowser(String browserName){

		System.out.println(browserName+ "Browser launched sccessfully");
		return browserName;
	}
	void loadUrl() {
		System.out.println("Application URL Loaded Successfully");
	}
	public static void main(String[] args) 	
	{
		Browser edge = new Browser();
		edge.launchBrowser("Edge");
		edge.loadUrl();



	}
}


