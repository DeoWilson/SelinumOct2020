package week1.day1;

public class Fib {

	public static void main(String[] args) {
		int sum=0;
		int range =8;
		int firstNumber=0;
		int secondNumber=1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		 for (int i = 2; i < range; i++) {
			 sum = firstNumber + secondNumber;
			 firstNumber = secondNumber;
			 secondNumber = sum;
			 System.out.println(sum);
			
		}
		

	}

}
