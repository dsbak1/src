
public class Student {

	//String type is used for consistency purposes 
	// + if student id contains more then just numbers
	// use givenName and familyName as some students do not have middle names
	private String studentId, givenName, familyName;
	
	public Student(String newStudentId, String newGivenName, String newFamilyName) {
		// TODO Auto-generated constructor stub
		this.studentId = newStudentId;
		this.givenName = newGivenName;
		this.familyName = newFamilyName;
	}
	
	public void setGivenName(String input){
		givenName = input;
	}

	public void setFamilyName(String input){
		familyName = input;
	}
	
	public String description(){
		return studentId + " " + givenName + " " + familyName;
	}
}
