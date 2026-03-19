package stringsPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {

		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of the array:");
//		int size=sc.nextInt();
//		int[] elements=new int[size];
//		System.out.println("enter array elements:");
//		for(int i=0;i<size;i++)
//		{
//			elements[i]=sc.nextInt();
//		}
//		System.out.println("before sorting:" +Arrays.toString(elements));
//		Arrays.sort(elements);
//		System.out.println("after sorting:" +Arrays.toString(elements));
		
		int[] a= {10,30,20,40};

		

		System.out.println("before sorting:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting:" +Arrays.toString(a));
		
		
		
	}

}
