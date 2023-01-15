package application;

import java.util.HashMap;
import java.util.LinkedList;

public class Action {
	String department;
	int level;
	static LinkedList<String> courseCodeChoice = new LinkedList<String>();
	static LinkedList<String> courseCodeChoice2 = new LinkedList<String>();

	static HashMap<String,Integer> mapCourse=new HashMap<String,Integer>();
	
     static HashMap<String,String> detailsS=new HashMap<String,String>();
	
	
	
public static void temp_storage(String matNo, String surname, String othernames, String gender, String phoneNum, String email,String stateOfOrigin, String modeOfEntry, String dept, String level) {
		
		
		detailsS.put("Surname", surname);
		detailsS.put("Othernames", othernames);
		detailsS.put("Mat-Number", matNo);
		detailsS.put("Gender", gender);
		detailsS.put("Phone-Number", phoneNum);
		detailsS.put("Email", email);
		detailsS.put("State-of-Origin", stateOfOrigin);
		detailsS.put("Mode-of-Entry", modeOfEntry);
		detailsS.put("Department", dept);
		detailsS.put("Level", level);
	
		
		
	}


 
 

	
	

	


	


}
