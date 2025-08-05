package lab2prgs;
import java.util.Scanner;
public class Comparing_strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string : ");
		String s1=sc.nextLine();
		System.out.println("enter the secong string : ");
		String s2=sc.nextLine();
		
		System.out.println("using 'equals()' :"+ s1.equals(s2));
		System.out.println("using '==' : "+ (s1==s2));
	}

}
