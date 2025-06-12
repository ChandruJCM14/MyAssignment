package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 0;
        int b = 1;
        int c;
        int range = 8;
        System.out.println("List of Fibonacci Series");
        for(int i=0;i<=range;i++) {
        	System.out.print(""+","+ a);
        	c = a+b;
        	a=b;
        	b=c;
        }
	}

}
