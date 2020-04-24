package Lab5;
import java.util.*;



public class trafficlight {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n1=1;
while(n1!=4)
{
System.out.println("Enter your choice\n 1.red\n 2.yellow \n 3. green");

int n=sc.nextInt();
switch(n)
{
case 1: System.out.println("Stop");
break;
case 2:System.out.println("Ready");
break;
case 3:System.out.println("Go");
break;
case 4: System.out.println("EXIT");
return;
}
}
}
}


