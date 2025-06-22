package week2.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "Changegame";
		char[] charArray = test.toCharArray();
		for (int i = charArray.length-1;i>=1; i--) {
			if (i%2 !=0)
				charArray[i]=Character.toUpperCase(charArray[i]);
			 for(char ch:charArray)
			{
				System.out.println(ch);
			}
		}
	}

}
