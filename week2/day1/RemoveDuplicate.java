package week2.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basic as part of java sessions in java week1";
		String[] words = text.split(" ");
		int count=0;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					words[j]=" ";
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("Duplicates Removed");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]+" ");
			}
		} else {
System.out.println("No Duplicates Found");
		}
	}

}
