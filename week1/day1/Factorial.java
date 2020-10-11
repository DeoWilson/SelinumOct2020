package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int temp=0;
		
		for (int i = 0; i < 5 ; i++) {
			temp = fact * (i+1);
			fact=temp;
		}
		System.out.println("The Factorial of 5 is: " +temp);

	}

}
