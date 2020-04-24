package Lab6;

import java.util.Scanner;
public class jio {
static String alterString(String input)
{
String consonants = "BCDFGHJKLMNPQRSTVWXYZ".toUpperCase();//consonants string to compare
Scanner b = new Scanner(System.in);
System.out.println("enter  string");
String inputString=b.nextLine();//syntax to give string
inputString = inputString.toUpperCase();

String returnStr="";
for(int i=0; i < inputString.length(); i++)
{
     char inputChar = inputString.charAt(i); //charAt(i) value is stored in char

     int indOfCons = consonants.indexOf(inputChar);//index value is stored in indofcons

     if (indOfCons != -1) //if the index value is not found then it gives -1.
     {
           indOfCons++;

           // if the letter is Z, then go around to B
           if (indOfCons == consonants.length())
           {
                indOfCons = 0;
           }
           returnStr += consonants.charAt(indOfCons);
     }
     else
     {
           returnStr +=  inputChar;
     }
   //System.out.println(retStr);
}
return returnStr ;

}
public static void main(String[] args) {
String p=jio.alterString("");
System.out.println(p);
}
}