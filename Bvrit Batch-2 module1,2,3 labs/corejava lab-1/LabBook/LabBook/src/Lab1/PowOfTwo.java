package Lab1;
import java.util.Scanner;
public class PowOfTwo {
	public boolean PowOf2(int n) {
		while(n!=1) {
			if((n%2)!=0)
				return false;
				n=n/2;
		}
		return true;
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	PowOfTwo pt=new PowOfTwo();
	boolean p=pt.PowOf2(n);
	System.out.println(p);
	
		

	}

}

