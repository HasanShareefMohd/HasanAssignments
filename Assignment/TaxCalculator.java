package Access_Specifiers_Constructors;

public class TaxCalculator {
	public double calculateTax(String empName,boolean isIndian,double empSal)   {
		double taxAmount = 0;
	try {//try block
		if(isIndian==false) {//if not Indian throw this
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax”");
		}
		if(empName=="") {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
	if(empSal>100000) {
	 return taxAmount =empSal *8/100;//logic
	}
	if(empSal>=50000 && empSal<100000) {
	 return taxAmount =empSal *6/100 ;//logic
	}
	if(empSal>=30000 && empSal<50000) {
		return taxAmount =empSal *5/100 ;//logic
	}
	if(empSal>=10000 && empSal<30000) {
		return taxAmount =empSal *4/100 ;//logic
	}
	else
		throw new TaxNotEligibleException("The employee does not need to pay tax");
	}
	catch(Exception e) {//catch block
		System.out.println(e);
	}
	return taxAmount;
	}
}
public class CalculatorSimulator {
	public static void main(String[] args)   {//main method
		TaxCalculator t=new TaxCalculator();
		System.out.println("Fro Ron:");
		System.out.println("tax amount is "+t.calculateTax("Ron", false, 34000));//method calling and printing
		System.out.println("Fro Tim:");		
		System.out.println("tax amount is "+t.calculateTax("Tim", true, 1000));//2nd statement
		System.out.println("Fro jack:");
		System.out.println("tax amount is "+t.calculateTax("jack", true, 55000));//3rd ststement
		System.out.println("Fro null:");
		System.out.println("tax amount is "+t.calculateTax("", true, 30000));		//4th statement
	}
}
