package programs;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,100,1};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("duplicate number is:" +num[i]);
				}
			}
		}
	}

}
