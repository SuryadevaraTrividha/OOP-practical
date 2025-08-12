package lab3prgs;
import java.util.Scanner;
public class Display_name {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String a=sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
	}
}
