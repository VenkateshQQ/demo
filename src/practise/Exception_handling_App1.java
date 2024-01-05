package practise;
import java.util.*;

public class Exception_handling_App1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter a Number");
			int a=s.nextInt();
			System.out.println("you Entered:"+a);
		}
		
		catch(InputMismatchException e) {
			System.out.println("Enter a valid number");
			
		}
		finally {
			System.out.println("Finally block executed");
			s.close();
		}
	}
}
