package Menu_Driven_Employemanage_App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Start 
{
    public static void main( String[] args ) throws NumberFormatException, IOException, SQLException
    {
    	System.out.println("Welcome to Student Management App");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	System.out.println("PRESS 1 TO ADD A STUDENT");
        	System.out.println("PRESS 2 TO DELETE A STUDENT");
        	System.out.println("PRESS 3 TO DISPLAY STUDENTS");
        	System.out.println("PRESS 4 TO EXIT APP");
        	int c = Integer.parseInt(br.readLine());
        	
        	if (c==1) 
        	{
        		// add student
        		System.out.println("Enter user name:- ");
        		String name = br.readLine();
        		
        		System.out.println("Enter user department:- ");
        		String dept = br.readLine();
        		
        		System.out.println("Enter user phone:- ");
        		long phone = Long.parseLong(br.readLine());
        		
        		System.out.println("Enter user city:-");
        		String city = br.readLine();
        		
//        		creating student object to store student
        		Student st = new Student(name, dept, phone, city);
        		boolean ans = StudentDao.insertStudentToDB(st);
        		if(ans) {
        			System.out.println("Data inserted successfully....");
        		} else {
        			System.out.println("Something went wrong try again");
        		}
        		System.out.println(st);
        		
        		
        	}else if(c==2) {
        		// delete student
        		System.out.println("Enter student Id to delete:- ");
        		int userId = Integer.parseInt(br.readLine());
        		boolean f = StudentDao.deleteStudent(userId);
        		if(f) {
        			System.out.println("Deleeted...");
        		}else {
        			System.out.println("Something went wrong...");
        		}
        	}else if(c==3) {
        		// display student
        		StudentDao.showAllStudent();
        		
        	}else if(c==4) {
        		// exit
        		break;
        	}
        }
        System.out.println("Thank you for using the app..");
    }
}