package arrays;

public class FindLargestElement {

	public static void main(String[] args) {

		int[] a= {1,2,5,6};
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}

}
