package arrays;

public class FindSmallestElement {

	public static void main(String[] args) {

		int[] a= {1,2,-0,0,-1};
		int small=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("smallest is:" +small);
	}

}
