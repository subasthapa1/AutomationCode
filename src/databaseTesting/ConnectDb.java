package databaseTesting;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ConnectDb {
 public static void main(String args[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	 //public void testDb() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver").newInstance();
	 Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Testdb","root","");
  Statement stmt= (Statement) con.createStatement();
  //SELECT user_id,start_time,SUM(duration) FROM `user` where user_id='1' GROUP BY user_id,start_time order by start_time
  ResultSet rs= stmt.executeQuery("select * from user");
 while(rs.next()){
	 int myId=rs.getInt("user_id");
	  System.out.println("Userid is"+myId);
	  
	  String startDate=rs.getString("start_time");
	  System.out.println("start date is"+startDate);
	  
	  String endDate=rs.getString("end_time");
	  System.out.println("end date is"+endDate);
	  
      int myInt=rs.getInt("duration");
         System.out.println("Duration is"+myInt);
  }
 ResultSet res1= stmt.executeQuery("SELECT user_id,start_time,SUM(duration) as t FROM `user` where user_id='1' GROUP BY user_id,start_time order by start_time");
 List<ArrayList<Integer>> userArray = new ArrayList<>();
 ArrayList<Integer> userIdArray = new ArrayList<Integer>();
 ArrayList<String> startTimeArray = new ArrayList<String>();
 ArrayList<Integer> durationArray = new ArrayList<Integer>();
 while(res1.next()){
	 int field1=res1.getInt("user_id");
	 System.out.println(field1);
	 userIdArray.add(field1);
	 
	 String startTimeField= res1.getString("start_time");
	 System.out.println(startTimeField);
	 startTimeArray.add(startTimeField);
	 
	 int field3=res1.getInt("duration");
	 System.out.println(field3);
	 durationArray.add(field3);
 }
  }
  }


