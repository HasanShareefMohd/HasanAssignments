package Menu_Driven_Employemanage_App;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	 static Connection con;
	  
	  public static Connection createC() {
		  try {
			  // load the driver
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  // create the connection
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hasandb", "root", "Ashu@786");
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		return con;
		  
	  }

}