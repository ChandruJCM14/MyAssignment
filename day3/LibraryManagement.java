package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib = new Library();
		String name = lib.addBook("Whatever");
		System.out.println("Book name:"+ name);
		lib.issuebook();


	}

}
