package Lab1;
import java.util.Scanner;
public class IncNum {
	public boolean checkNumber(int n){
		int rem=0;
		while(n!=0) {
			rem=n%10;
			
			n=n/10;
		int	k=n%10;
			if(k<rem)
				return true;
			break;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		IncNum c=new IncNum();
		boolean in=c.checkNumber(n);
		System.out.println(in);
		
		

	}

}

