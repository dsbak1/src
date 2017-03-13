import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class University {
	ArrayList<String> unitArray = new ArrayList<String>();
	
	private void createUnits(){
		Student student1 = new Student(readString("Enter Student ID: "), 
				readString("Enter Student Firstname: "), 
				readString("Enter Student Lastname: "));
		
		Student student2 = new Student("04321233", "Jacob", "Spaghetti");
		Student student3 = new Student("02934838", "Jenny", "Stringer");

		Unit unit1 = new Unit();
		Unit unit2 = new Unit();
		Unit unit3 = new Unit();
		
		unit1.unitCode = "FIT2099";
		unit1.unitName = "Object Orientation design and implementation";
		unit1.enrolStudent(student1);
		
		unit2.unitCode = "FIT2083";
		unit2.unitName = "Introduction to Cyber Security";
		unit2.enrolStudent(student2);
		
		unit3.unitCode = "FIT2081";
		unit3.unitName = "Developing Mobile Apps";
		unit3.enrolStudent(student3);
		
		unitArray.add(unit1.description());
		unitArray.add(unit2.description());
		unitArray.add(unit3.description());
	}
	private String readString(String prompt) {
		System.out.print(prompt);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		try {
			s = in.readLine();
		}	catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	private void displayUnits(){
			for(int i = 0; i<unitArray.size(); i++){
				System.out.println(unitArray.get(i));
			};
	}
	
	public void printStatus() {
		System.out.println("Welcome to Java University" + "\n");
		
		createUnits();
		displayUnits();
		
		System.out.println("Thank you for using Java University");
	}
}
