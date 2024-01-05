package practise;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.nextLine();
		String revStr="";
		System.out.println("String:");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("Reverse String:");
		for(int i=str.length()-1; i>=0; i--) {
			revStr=revStr+str.charAt(i);
		}
		System.out.println(revStr);
	}
}
