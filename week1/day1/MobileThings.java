package week1.day1;

public class MobileThings {
	long mblNum = 9876543210L;
	float price = 49999.75f;
	String brand= "Sony";
	boolean isFullCharged = true;
	
	
	public static void main(String[] args) {
		MobileThings sample1 = new MobileThings();
		System.out.println("Mobile Number is "+sample1.mblNum);
		System.out.println("Price is "+sample1.price);
		System.out.println("Brand is "+sample1.brand);
		System.out.println("Is Fully Charged : "+sample1.isFullCharged);
		
	}

}
