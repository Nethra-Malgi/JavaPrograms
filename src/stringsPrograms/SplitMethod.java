package stringsPrograms;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1="a,b,c";
//		String[] s2=s1.split(",");
//		System.out.println(s2.length); //3
		
//		String s1="a,,b,,c";
//		String[] s2=s1.split(",");
//		System.out.println(s2.length); //5
		
//		String s1="a,b,,c,,"; //java will remove the empty spaces at the end and it will not consider
//		String[] s2=s1.split(",");
//		System.out.println(s2.length); //4
		
//		String s1=",ab,";
//		String[]s2=s1.split(",");
//		System.out.println(s2.length);//2
		
//		String s1="a.b.c";
//		String[]s2=s1.split("."); //regex character and it will be avioded using escape character
//		System.out.println(s2.length); //0
		
		String s1="a.b.c";
		String[]s2=s1.split("\\.");
		System.out.println(s2.length); //3
		
		//uppercase
		String s3="nethra";
		s3.toUpperCase();//nethra
		System.out.println(s3); //original value of the string will not change as strings are immutable in nature
		
		String s4="nethra";
		s4=s4.toUpperCase(); //assigning to other variable
		System.out.println(s4); //NETHRA
		
		
		

	}

}
