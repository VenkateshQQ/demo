package practise;
import java.util.Scanner;
public class HelloWorldNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=s.nextLine();
		String numStr="";
		int num=1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='L' || str.charAt(i)=='l') {
				numStr=numStr+num;
				num++;
			}
			else {
				numStr=numStr+str.charAt(i);
			}
		}
		System.out.println(numStr);
	}
}
