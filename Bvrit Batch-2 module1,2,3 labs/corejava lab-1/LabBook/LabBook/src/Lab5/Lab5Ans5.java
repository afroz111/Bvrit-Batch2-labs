package Lab5;
import java.util.Scanner;

public class Lab5Ans5 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age<15)
			{
				throw new ageException("age should be above 15");
				
			}
			
		}
		catch(ageException e) {
			System.out.println(e);
		}
	}

}
class ageException extends Exception{
	ageException(String msg){
		super(msg);
	}
}

