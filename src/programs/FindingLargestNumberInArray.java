package programs;

import java.util.Arrays;

public class FindingLargestNumberInArray {

	public static void main(String[] args) {

		
		int[] b= {1,3,5,89,-7,-2};
		int largest=b[0];
		int smallest=b[0];
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>largest)
			{
			largest=b[i];
			}
			else if(b[i]<smallest)
			{
				smallest=b[i];
			}
		}
		
		System.out.println("\n given array elements are:"+Arrays.toString(b));
		System.out.println("largest number is: " +largest);
		System.out.println("smallest number is:" +smallest);
	}

}
