package Menu_Driven_Employemanage_App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = ConnectionProvider.createC();
			// prepared statement
			PreparedStatement pst = con.prepareStatement("insert into students(sname, sdept, sphone, scity) values (?, ?, ?, ?)");
			// set the value of parameter
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentDept());
			pst.setLong(3, st.getStudentPhone());
			pst.setString(4, st.getStudentCity());
			
			pst.executeUpdate();
			f = true;
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = ConnectionProvider.createC();
			// prepared statement
			PreparedStatement pst = con.prepareStatement("delete from students where sid=?");
			// set the value of parameter
			pst.setInt(1, userId);
			pst.executeUpdate();
			f = true;
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		return f;
		
	}

	public static void showAllStudent() {
		try {
			// jdbc code
			Connection con = ConnectionProvider.createC();
			// prepared statement
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery("select * from students");
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Phone: " + phone);
				System.out.println("City: " + city);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

}
}