package Menu_Driven_Employemanage_App;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	private int studentId;
	private String studentName;
	private String studentDept;
	private long studentPhone;
	private String studentCity;
	
	public Student(String studentName, String studentDept, long studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	
	
}