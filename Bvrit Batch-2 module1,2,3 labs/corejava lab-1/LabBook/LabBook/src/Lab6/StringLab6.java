package Lab6;

import java.util.*;
public class StringLab6 {
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String a=sc.nextLine();
boolean flag=string_Check(a);
System.out.println(flag);
}

public static boolean string_Check(String a) {
boolean flag=true;
int n=a.length();
char b[]=new char[n];
for(int i=0;i<n;i++)
{
b[i]=a.charAt(i);
}
Arrays.sort(b);
for(int i=0;i<n;i++)
{
if(b[i]!=a.charAt(i))
flag=false;

}
return flag;
}

}
