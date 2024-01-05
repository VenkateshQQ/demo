package practise;
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double balance=2000.00;
		System.out.println("Enter Amount you want?");
		int amount=s.nextInt();
//		double remBal=balance-amount;
		if(amount<balance) {
			if(amount%100==0) {
				System.out.println("Transaction Successfull...");
			}
			else {
				System.out.println("Enter the amount in multiple of Hundreds...");
			}
		}
		else {
			System.out.println("Insufficient fund....");
		}
	}
}
