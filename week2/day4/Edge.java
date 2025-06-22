package week2.day4;

import io.cucumber.java.an.E;

public class Edge extends Chrome{
	public void takeSnap(){
		 System.out.println("Snapsoht taken");
	 }
	 public void clearCookies() {
	 System.out.println("Cookies was cleared");
	 
	 }
	 public static void main(String[] args) {
		Edge e = new Edge();
		e.browserName="Edge";
		e.browserVersion="20.3";
		e.openIncognito();
		e.closeBrowser();
		e.navigateBack();
		e.clearCache();
		e.clearCookies();
		
	}
}
