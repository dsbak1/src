import java.util.ArrayList;

public class Unit {
	String unitCode, unitName;
	
	//ArrayList is used as number of students is unknown
	public ArrayList<String> students = new ArrayList<String>();
	
	public String description(){
		String retval = "";
		for(int i = 0; i<students.size(); i++){
			retval += students.get(i);
		}
		return unitCode + " " + unitName + "\n" +
		"Enrolled Students:" + "\n" + retval + "\n";
	}
	
	public void enrolStudent(Student newStudent){
		students.add(newStudent.description());
	}

}
