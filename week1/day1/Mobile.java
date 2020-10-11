package week1.day1;

public class Mobile {
	
	public void sendSms() {
		System.out.println("Message sent");
	}
	public void takePhoto() {
		System.out.println("Photo taken");
		makeCall();
	}
	public void makeCall() {
		System.out.println("Person called");
	}
public static void main(String[] args) {
	Mobile sample = new Mobile();
	sample.sendSms();
	sample.takePhoto();
	sample.makeCall();
}
}
