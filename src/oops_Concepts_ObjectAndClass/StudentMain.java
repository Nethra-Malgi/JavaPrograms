package oops_Concepts_ObjectAndClass;

public class StudentMain {

	public static void main(String[] args) {
		
		//creating the objects inside the main method
		
		Student st1=new Student();
		
		st1.sid=12;
		st1.sname="Nethra";
		st1.department="civil";
		st1.grade='A';
		
		st1.studentDetails();
		
		System.out.println("\t");
		
        Student st2=new Student();
		
		st2.sid=13;
		st2.sname="Nethra M"; 
		st2.department="CS";
		st2.grade='A';
		
		st2.studentDetails(); 
		
		
	}

}
