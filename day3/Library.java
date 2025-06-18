package week1.day3;



public class Library {


	String addBook (String bookTitle)
	{
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	void issuebook()
	{
		System.out.println("Book issued Successfully");
	}
	public static void main(String[] args) {
		Library lib = new Library();
		String name = lib.addBook("Islands");
		System.out.println("Book name:"+ name);
		lib.issuebook();



	}
}
