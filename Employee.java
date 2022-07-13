package Assignment;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 2000.50;
	double hra = 1200.60;
	
	
	Employee(long id, String name, String address, long phone) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		
	}
	
	void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println(salary);
	}
	

	
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println(transportAllowance);
	}

}

class Manager extends Employee {
	
	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		
		System.out.println(transportAllowance);
	}
	

}

class Trainee extends Employee {
	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		basicSalary = salary;
	}
	
}