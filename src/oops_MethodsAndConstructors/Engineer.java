package oops_MethodsAndConstructors;

public class Engineer {
	
	//class variables can be accessing everywhere
	
	int engid;
	String engName;
	double engSal;
	String company;
	
	void printEngData()
	{
		System.out.println(engid+" "+engName+" "+engSal+" "+company);
	}
	
	void setEngData(int eid,String enName,double enSal,String com)
	{
		//assigning local variables to class level variables
		
		engid=eid;
		engName=enName;
		engSal=enSal;
		company=com;
	}
	
	//creating the constructor
	Engineer(int eid,String enName,double enSal,String com)
	{
		//initializing values to the variables
		engid=eid;
		engName=enName;
		engSal=enSal;
		company=com;
		
	}

}
