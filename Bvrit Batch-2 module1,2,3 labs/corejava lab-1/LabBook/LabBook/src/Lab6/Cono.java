package Lab6;
import java.util.Scanner;

public class Cono {
public static String getImage(String s) {

StringBuffer br=new StringBuffer(s);
br.reverse();
System.out.println(s+"|"+br);
return null;

}

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String sc=s.nextLine();
Cono.getImage(sc);
}

}



