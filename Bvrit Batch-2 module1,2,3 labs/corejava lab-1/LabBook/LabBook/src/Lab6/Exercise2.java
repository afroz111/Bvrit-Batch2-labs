package Lab6;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args)throws IOException {
int i,j=1;
Scanner s=new Scanner(System.in);



FileInputStream f=new FileInputStream("D:/apple.txt");
int n=f.available();
System.out.print(j+":");
for(i=0;i<n;i++)
{
int c=f.read();
char ch=(char)c;
System.out.print(ch);
if(ch=='\n')
System.out.print(++j+":");
}

}

}
