package overloading;

public class Students {
	
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " +id);

	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID:" +id+ "  Student Name: " +name);

	}
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("The Student Email:" +email+ "  Student Phone Number: " +phoneNumber);

	}
	public Students(){
		System.out.println("---Student Details---");
	}

	public static void main(String[] args) {
		Students var =new Students();
		var.getStudentInfo(953614105);
		var.getStudentInfo(953614105, "JohnWick");
		var.getStudentInfo("johnwick@gmail.com", 987654);

	}

}
