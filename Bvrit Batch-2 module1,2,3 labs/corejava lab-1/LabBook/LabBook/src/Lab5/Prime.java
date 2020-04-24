package Lab5;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int divisors;
		for(int i=1;i<=n;i++)
		{
		divisors=0;
		for(int j=2;j<i;j++)
		{
		if(i%j==0)
		divisors=1;
		}
		if(divisors==0)
		System.out.print(" " +i);
		}
		}
		}


