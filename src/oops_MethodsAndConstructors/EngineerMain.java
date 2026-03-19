package oops_MethodsAndConstructors;

public class EngineerMain {

	public static void main(String[] args) {

		
	//	Engineer en=new Engineer();
		/*en.engid=1002;
		en.engName="Kali";
		en.company="Google";
		en.engSal=4560098.908;
		en.printEngData();
		
		
		en.setEngData(1003, "Pavi", 456.9086, "Microsoft");
		en.printEngData();
		*/
		
		//invoking the constructor
		Engineer en=new Engineer(109, "Rohan", 123.987, "HCL");
		en.printEngData();
	}

}
