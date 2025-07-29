package lab1prgs;
import java.util.Scanner;
public class Squareroot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		float sr=0f;
		for(i=1;i<=n;i++) {
			sr=(float)Math.sqrt(i);
		
		System.out.printf("\nsquare Root of %d: %.02f \n",i,sr);
		}
	}

}
