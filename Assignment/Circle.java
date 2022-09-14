package Access_Specifiers_Constructors;

public class Circle {
	float radius;
	float pi=3.5f;
	
	public Circle(){
		radius=1.5f;
	}
	public Circle(float radius) {
		this.radius=radius;
		
	}
	public Circle(float radius,float pi) {
		this.radius=radius;
		this.pi=3.5f;
	}
	public float calculateArea(float radius) {
		return pi*radius*radius;
	}
	public float calculateCircumference(float radius) {
		return 2*pi*radius;
	}
	public static void main(String[] args) {
		Circle cc=new Circle();
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius:");
		float Radius=sc.nextFloat();
		   sc.close();
		System.out.println("area is:"+cc.calculateArea(Radius));
		System.out.println("circumference is"+cc.calculateCircumference(Radius));
	}

}
