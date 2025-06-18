package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12421;
		int output = 123421;
		int rem;
		for (int i = input; i > 0;i= i/10) {
			rem = i%10;
			output=output*10+rem;
					
		}
		if (input==output) {
			System.out.println("The given number is Palindrome");
		} else {
			System.out.println("The given number is not Palindrome");
		}
	}

}
