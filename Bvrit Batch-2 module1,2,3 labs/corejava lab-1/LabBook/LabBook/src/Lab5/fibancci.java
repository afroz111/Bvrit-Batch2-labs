package Lab5;
import java.util.*;
public class fibancci {
	
		public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scanner.nextInt();
		int f1=1,f2=1,sum;
		for(int i=0;i<=n;i++)
		{
		sum=f1+f2;
		System.out.print(" "+f1);
		f1=f2;
		f2=sum;
		
		}
		}
		}


