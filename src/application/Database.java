package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

public class Database{
	private Statement myst;
	private ResultSet myque;
	private PreparedStatement myPrst;
	String deptSel,levelSel;
	String check;
    
     Database(){
    	 
     }
     Database(String course){
    	 this.check=course;
    	 
     }
     Database(String dept,String level){
    	 this.deptSel=dept;
    	 this.levelSel=level;
    	 
    	 
    	 
     }
	 
	 private Connection database() throws SQLException {
		 
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emco","root","!Theraja5566");
			return con;
	 }
	 void closeConnection() throws SQLException {
		
		
		
		
	}
	 int  insertRow(LinkedList<String> copy) {
		 
		 
		 return 0;
	 }
	 int delete(int studentId) throws SQLException {
			
			String t=String.format("delete from students where Std_id=%d",studentId);
			 myPrst=database().prepareStatement(t);
			int update=myPrst.executeUpdate(t);
			return update;
			
		 }
	 String getSemester() throws SQLException {
		 myst=database().createStatement();
			
			String t=String.format("select semester from courses where course_code='%s'",check);

			
			myque=myst.executeQuery(t);
			
			
			
			while(myque.next()) {
				
				return myque.getString("semester");
				
			}
			return null;
			
	 }
	 
	 int getCreditLoad() throws SQLException {
		 myst=database().createStatement();
		
		String t=String.format("select credit_load from courses where course_code='%s'",check);
		
		myque=myst.executeQuery(t);
		
		
		
		while(myque.next()) {
			return Integer.parseInt(myque.getString("credit_load"));
			
		}
		return 0;
		
		
	}
	
	 LinkedList<String[]> getCourse() throws SQLException {
		 LinkedList<String[]> courses=new LinkedList<String[]>();
		 LinkedList<String> querys = new LinkedList<String>();
		 myst=database().createStatement();
		 String t;
		 int levDec=0;
		 if(levelSel!="null") {
			 levDec=Integer.parseInt(levelSel);
		 }
		 
		 if(levelSel!="100") { 
		
			 while(levDec!=100) {
				 
				 levDec=levDec-100;
				if(!deptSel.equalsIgnoreCase("null")&&!levelSel.equalsIgnoreCase("null")) {
					 t=String.format("select * from courses where course_dept='%s' and Level=%d",deptSel,levDec);
					 querys.add(t);
					
					
				}
			 }
		 }
		 
		if(!deptSel.equalsIgnoreCase("null")&&!levelSel.equalsIgnoreCase("null")) {
			 t=String.format("select * from courses where course_dept='%s' and Level=%d",deptSel,Integer.parseInt(levelSel));
			 querys.add(t);
		}else if(!deptSel.equalsIgnoreCase("null")) {
			
			 t=String.format("select * from courses where course_dept='%s'",deptSel);
			 querys.add(t);

		}else if(!levelSel.equalsIgnoreCase("null")) {
			 t=String.format("select * from courses where Level=%d",Integer.parseInt(levelSel));
			 querys.add(t);

		}else {
			t=String.format("select * from courses");
			querys.add(t);
			
		}
			
		querys.forEach(query ->{
			try {
			myque=myst.executeQuery(query);
			while(myque.next()) {
			String[] course = {myque.getString("course_code"),myque.getString("course_title"),myque.getString("credit_load"),myque.getString("course_dept"),myque.getString("course_faculty"),myque.getString("course_description"),myque.getString("Level"),myque.getString("semester")};
			courses.add(course);
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	   
		return courses;
		
		
	}
	
	 LinkedList<String> getDept() throws SQLException {
		 LinkedList<String> depts=new LinkedList<String>();
		 myst=database().createStatement();
		
		String t=String.format("select * from emco.dept");
		
		
	    myque=myst.executeQuery(t);
		
		
		while(myque.next()) {
			depts.add(myque.getString("Departments"));
			
		}
	
		return depts;
		
	}
	
	 
	
}
			