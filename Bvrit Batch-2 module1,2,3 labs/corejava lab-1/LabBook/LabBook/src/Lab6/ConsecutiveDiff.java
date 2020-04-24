package Lab6;

//package com.cg.arraydemo;
import java.util.Scanner;
import java.lang.Math;
public class ConsecutiveDiff {


public  static void main(String[] args)
{

Scanner p=new Scanner(System.in);
System.out.println("enter size of array");
int n=p.nextInt();
int b[]=new int[n];
int a[]=new int[n];
System.out.println("Enter Array elements");
for(int i=0;i<n;i++)
{
//int b[] = new int[n];
a[i]=p.nextInt();
}
   for(int i=1;i<n;i++)
   {
  if(i<n)
b[i-1]=a[i]-a[i-1];
if(i==n-1)
{
b[i]=a[i]-a[0];
}


}
   
  for(int i=1;i<n;i++) {
  if(b[i]<0)
  {
  b[i]=Math.abs(b[i]);
  }
   }
for(int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}


//  private static int abs(int i) {
 
//  return 0; }

}




