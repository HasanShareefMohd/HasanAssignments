package Assignment;

public class Interface {
	public static void main(String[] args) {
		System.out.println("StudentUser");//student user class
		System.out.println();
		StudentUsers k = new StudentUsers();
		k.setAge(10);
		k.registerAccount();
		k.setAge(18);
		k.registerAccount();
		
		k.setBookType("Student");
		k.requestBook();
		k.setBookType("Science");
		k.requestBook();
		
		
		System.out.println("SeniorUser");//senior user class
		System.out.println();
		SeniorUsers A = new SeniorUsers();
		A.setAge(5);
		A.registerAccount();
		A.setAge(23);
		A.registerAccount();
		
		A.setBookType("Student");
		A.requestBook();
		A.setBookType("Science");
		A.requestBook();
	}

}


