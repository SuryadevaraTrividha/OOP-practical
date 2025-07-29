package lab1prgs;
import java.util.Scanner;

public class Bagofapples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no.of apples in jerry's bag: ");
		int a=sc.nextInt();
		System.out.println("enter the no.of apples in tom's bag: ");
		int b=sc.nextInt();
		
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.printf("jerry's bag has: %d apples", a);
		System.out.printf("\nTom's bag has: %d apples",b);
	}

}
