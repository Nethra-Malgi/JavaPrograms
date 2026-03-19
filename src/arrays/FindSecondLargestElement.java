package arrays;

public class FindSecondLargestElement {

	public static void main(String[] args) {

		int[] a= {-1,2,0,-2};
		//what if array has duplicate elements:-still this logic works
		//what is array has only one element:-stll works and consider that element is sec largest only
		int first=a[0];
		int sec=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				sec=first;
				first=a[i];
			}
			
			else if(a[i]>sec && a[i]!=first)
			{
				sec=a[i];
			}
		}
		System.out.println("second largest is:" +sec);
		
	}

}
