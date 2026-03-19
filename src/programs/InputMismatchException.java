package programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) throws IOException {
		//unchecked exception:-not identified by the java compilor
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a integer..");
		int num=sc.nextInt();
		System.out.println("you entered a number:" +num);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("invalid input, please enter a integer");
		}
		
		//checked exception:-identified by the java compilor and without resolving this
		//we cannot execute the program
		//fileNotFound
		FileReader file = new FileReader("C:\\Users\\2230528\\OneDrive - Cognizant\\Certificates\\ISTQB.pdf");
		try {
		
		//int red=file.read();
		//System.out.println(red);
		System.out.println("the file is present in the pc:" );
		}catch(Exception e)
		{
			e.printStackTrace();
		  System.out.println(e.getMessage());

		}
		finally
		{
			file.close();
		}
		
	}

}
