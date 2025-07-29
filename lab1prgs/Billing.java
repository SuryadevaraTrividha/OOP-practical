package lab1prgs;
import java.util.Scanner;

public class Billing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System .out.println("enter the bill amount: ");
		int amount=sc.nextInt();
		
		double gst=amount*0.18;
		double mfee=50;
		
		double totalprice=amount+gst+mfee;
		double discount;
		if(amount>1000) {
			 discount=amount*0.10;
		}
		else {
			 discount=amount*0.15;
		}
		
		double totaldis_price=totalprice-discount;
		
		System.out.println("--Bill Amount--");
		System.out.println("amount : "+amount);
		System.out.println("gst : "+gst);
		System.out.println("maintenence fee : "+ mfee);
		System.out.println("price without discount : "+ totalprice);
		System.out.println("total price after discount : "+totaldis_price);
	}

}
