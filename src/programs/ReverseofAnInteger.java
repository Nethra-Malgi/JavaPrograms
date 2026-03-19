package programs;

public class ReverseofAnInteger {

	public static void main(String[] args) {
		//1.using logic
		int num=12345;
		int rev=0;
		while(num!=0)
			
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("reversed integer is:" +rev);
		
		//2.using string buffer
//		StringBuffer sf=new StringBuffer(String.valueOf(num)).reverse();
//		
//		System.out.println("reversed integer is:" +sf);

		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
	}

}
