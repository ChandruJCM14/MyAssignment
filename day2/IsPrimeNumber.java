package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		int count=0;
		for (int i=2;i<number-1;i++){
			
			if (number%i == 0) {
				count+=1;
			}
		}
		if (count == 0) 
		{
			System.out.println("The Given Number is a prime number");
		}
		else 
		{
			System.out.println("The Given Number is not a prime number");
		}
	}
}
	