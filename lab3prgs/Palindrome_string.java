package lab3prgs;
import java.util.Scanner;
public class Palindrome_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String a=sc.nextLine();
		
		StringBuilder b=new StringBuilder (a);
		String reversed=b.reverse().toString();

        if (a.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
	}
}
