package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Connection1{
	static {
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection( "jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");//creating connection
		 
	}
}

public class BankManagement {
	public static void main(String[] args) {
		
		for (int i=1;i>0;i++) {
				Scanner sc = new Scanner (System.in);
				System.out.println("press 1. to create new account :\npress 2. to deposit money :\npress 3. to withdrawal money :\npress 4. to check your account :\npress 5. to check all account :\npress 6. to delete account :\npress 7. to  close:  ");
				int press=sc.nextInt();

		//this block is to create new account		
		if (press==1) {
					System.out.println("enter A/C no.:");
					int accountNo=sc.nextInt();
					System.out.println("enter name:");
					String name=sc.next();
					System.out.println("enter phone:");
					int phone=sc.nextInt();
					System.out.println("enter balance:");
					int balance =sc.nextInt();
					try {
					
						//Creating connection
					Connection con=Connection1.con();  
						PreparedStatement stm; 
					String sql="insert into bank values(?,?,?,?)";
				   
					stm = con.prepareStatement(sql);
					stm.setInt(1, accountNo );
					stm.setString(2, name);
					stm.setLong(3, phone);
					stm.setLong(4, balance);
			        stm.execute();
					  con.close();
					  System.out.println("ACCOUNT CREATED SUCCESSFULLY");
					}
					catch(Exception e) {
						System.out.println(e);
					}
						
				}
		////this block is to deposit money	
		else if (press==2) {
					
					try {
						//Creating connection
				Connection con=Connection1.con();
				Statement stm=con.createStatement();//creating statement
				System.out.println("enter A/C no.:");
				int accountNo=sc.nextInt();
				System.out.println("enter ammount you want to deposit:");
				int newMoney=sc.nextInt();
				
				ResultSet rs=stm.executeQuery("select balance from bank where accountNo="+accountNo);
				while(rs.next()) {
				long updatedMoney=(rs.getLong(1)+newMoney);
				System.out.println("old balance:"+rs.getLong(1));
				System.out.println("updated balance:"+updatedMoney);
				stm.executeUpdate("update bank set balance="+updatedMoney+" where accountNo="+accountNo);
				System.out.println("MONEY DEPOSITED SUCCESSFULLY");
				}
				
				rs.close();
				con.close();

					}
					catch(Exception e) {
						System.out.println();
					}	
				}
		////this block is to withdrawal money		
		else if (press==3) {
			    try {
				
				Connection con=Connection1.con();//Creating connection
				Statement stm=con.createStatement();//creating statement
				System.out.print("enter A/C no.:");
				int accountNo=sc.nextInt();
				System.out.print("enter ammount you want to withdrawal:");
				int withdrawalMoney=sc.nextInt();
				
				ResultSet rs=stm.executeQuery("select balance from bank where AccountNo="+accountNo);
				while(rs.next()) {
				long updatedMoney=(rs.getLong(1)- withdrawalMoney);
				System.out.println("old balance:"+rs.getLong(1));
				System.out.println("updated balance:"+updatedMoney);
				stm.executeUpdate("update bank set balance="+updatedMoney+" where accountNo="+accountNo);
				 System.out.println("BALANCE WITHDRAWL SUCCESSFULLY");
				}
				rs.close();
				con.close();
				
					}
					catch(Exception e) {
						System.out.println();
					}	
				}
		//this block is to check one account
		else if (press==4) {
			     try {
				 
				Connection con=Connection1.con();//Creating connection
				Statement stm=con.createStatement();//creating statement
				System.out.print("enter your A/C no.:");
				int accountNo=sc.nextInt();

				ResultSet rs=stm.executeQuery("select * from bank where accountNo="+accountNo);
				while(rs.next()) {
			System.out.println("BANK ACCOUNT DETAILS :\n"+"A/C no.:"+rs.getInt(1)+"\nNAME:"+rs.getString(2)+"\nphone:"+rs.getLong(3)+"\nBALANCE:"+rs.getLong(4));
				}
				rs.close();

					}
					catch(Exception e) {
						System.out.println();
					}	
				}

		//this block is to check all account
		else if (press==5) {
			    try {
				Connection con=Connection1.con();//Creating connection
				Statement stm=con.createStatement();//creating statement
				ResultSet rs=stm.executeQuery("select * from bank");
				while(rs.next()) {
			System.out.println("BANK ACCOUNT DETAILS :\n"+"A/C no.:"+rs.getInt(1)+"\nNAME:"+rs.getString(2)+"\nphone:"+rs.getLong(3)+"\nBALANCE:"+rs.getLong(4));
				}
				rs.close();

					}
					catch(Exception e) {
						System.out.println(e);
					}	
				}
		//this block is to delete account
		else if (press==6) {
		    try {
			 
			Connection con=Connection1.con();
			Statement stm=con.createStatement();//creating statement
			System.out.print("enter your A/C no. you want to delete:");
			int accountNo=sc.nextInt();
		     stm.executeUpdate("delete  from bank where accountNo="+accountNo);
		     System.out.println("BANK A/C DELETED");
				}
				catch(Exception e) {
					System.out.println(e);
				}	
			}
		else if(press==7) {
			System.out.println("ACCOUNT CLOSED \nTHANKYOU");
		      }

			System.out.println("---------------------------------------");	
			}

		}
		}


