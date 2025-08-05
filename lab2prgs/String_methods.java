package lab2prgs;
import java.util.Scanner;

public class String_methods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("the given string : "+a);
		System.out.println("charAt 4th position is : "+ a.charAt(4));
		System.out.println("length of the string : "+ a.length());
		System.out.println("string in uppercase : "+ a.toUpperCase());
		System.out.println("string in lowercase : "+ a.toLowerCase());
		System.out.println("sub-string at 2,4 : "+ a.substring(2,4));
		System.out.println("string has path 'dab'? : "+ a.contains("dab"));
		sc.close();
	}
}
