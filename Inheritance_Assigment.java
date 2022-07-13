package Assignment;

public class Inheritance_Assigment {
	public static void main(String[] args) {
			System.out.println("Manager:");
			 Manager m = new Manager(12345, "Hasan", "Hydrabad", 060606, 66666);
			m.calculateSalary();
			m.calculateTransportAllowance();
			System.out.println("Trainee:- ");
			Trainee t = new Trainee(54321, "Ashu", "Mumbai", 323232, 55555);
			t.calculateSalary();
			t.calculateTransportAllowance();
			}
		}


