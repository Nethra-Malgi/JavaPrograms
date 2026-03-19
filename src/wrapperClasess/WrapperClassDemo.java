package wrapperClasess;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		String s="100";
		//String s="hello"; //number format exception
		//convert string--->int,double,boolean
		//conversion from string to char is not possible
        int s1=Integer.parseInt(s)	;	
        System.out.println(s1); 
        System.out.println(Double.parseDouble(s));
        System.out.println(Boolean.parseBoolean(s));
        
        
        //conver primitive data types to string
        //int,double,boolean,char---->string
        int x=123;
        double y=123.90;
        boolean z=true;
        char a='A';
        float f=(float) 1.2;
        String s2=String.valueOf(x);
        System.out.println(s2);
        System.out.println(String.valueOf(y));
        System.out.println(String.valueOf(z));
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(f));
		

	}

}
