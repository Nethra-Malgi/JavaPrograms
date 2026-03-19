package javaKeywords_final;

public class Student {

	    int id;
		String name;		
		final String country;
		
		public Student(int id,String name,String country){
			//country="america";
			this.country=country;
			this.id=id;
			this.name=name;
			
		}
		
		
		public void studentDetails()
		{
			System.out.println("id:" +id);
			System.out.println("name:" +name);
			System.out.println("country:" +country);

		}
		
		public final void m2()
		{
			System.out.println("this is automation");
		}
	}


