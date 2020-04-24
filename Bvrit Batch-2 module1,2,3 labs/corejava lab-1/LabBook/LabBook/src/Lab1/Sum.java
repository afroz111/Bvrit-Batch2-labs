package Lab1;

import java.util.*;

public class Sum {
	
		public int CalculateSum(int n) {
			int sum=0,i;
			for(i=0;i<=n;i++) {
				if(i%3==0 || i%5==0)
					sum=sum+i;
			}
			return sum;
			
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no:"); 
			int n= sc.nextInt();
			Sum s=new Sum();
			int c=s.CalculateSum(n);
			System.out.println(c);
			
			
		}

	}


