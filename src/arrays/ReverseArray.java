package arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] x= {1,2,3,4,5};
		
		//approach 1
//		for(int i=x.length-1;i>=0;i--)
//		{
//			System.out.print(x[i]+" ");
//		}
		
		//approach 2
		//reverse array within same array
		int start=0;
		int end=x.length-1;
		
		while(start<end)
		{
			int temp=x[start];
			x[start]=x[end];
			x[end]=temp;
			
			start++;
			end--;
						
			//9240249624

		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		

			}

}
