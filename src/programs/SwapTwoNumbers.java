package programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		//solution 1:using third variable
		int a=10;
		int b=20;
		int c;
//		System.out.println("before swapping the value of a is:" +a+ " and the value of b is:" +b);
//		c=a;//10
//		a=b;//20
//		b=c;//10
//		System.out.println("after swapping the value of a is:" +a+ " and the value of b is:" +b);

		//solution 2:using + operator
//		System.out.println("before swapping the value of a is:" +a+ " and the value of b is:" +b);
//
//		a=a+b; //a=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20
//
//		System.out.println("after swapping the value of a is:" +a+ " and the value of b is:" +b);
		
		//solution 3: using * operator
//		System.out.println("before swapping the value of a is:" +a+ " and the value of b is:" +b);
//
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("after swapping the value of a is:" +a+ " and the value of b is:" +b);

		//solution 4:using xor operator
		System.out.println("before swapping the value of a is:" +a+ " and the value of b is:" +b);

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping the value of a is:" +a+ " and the value of b is:" +b);

		
	}

}
