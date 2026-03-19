package arrays;

public class FindSumOfElements {

	public static void main(String[] args) {

		int[] b= {1,2,3,4,5,-1};
		
		int sum=0;
		
		for(int i=0;i<b.length;i++)
		{
			sum=sum+b[i];
		}
		
		System.out.println("sum is:" +sum);
	}

}
