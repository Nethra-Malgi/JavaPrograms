package arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {0,2,1,3,6,5};
		//if the array is unsorted also still this logic will work
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		for(int j=1;j<=6;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("missing number is:" +(sum1-sum));
	}

}
