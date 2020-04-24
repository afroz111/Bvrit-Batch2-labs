package Lab1;
import java.util.*;

public class Difference {
	public int calculateDifference(int n)
	 {
		int  sum=0,i,s=0;
		for(i=1;i<=n;i++) {
			sum=sum+i*i;
		}
		
 	for(i=1;i<=n;i++) {
			s=s+i;
		}
		int c=s*s;
		int d=sum-c;
		return d;
		
	}
	 
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:"); 
		int n= sc.nextInt();
		Difference di=new Difference();
		int df=di.calculateDifference(n);
		System.out.println(df);
		
		
	}

}

