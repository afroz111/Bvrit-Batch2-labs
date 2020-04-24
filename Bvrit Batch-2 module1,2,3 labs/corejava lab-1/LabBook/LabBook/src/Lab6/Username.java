package Lab6;
import java.util.*;
import java.lang.String;
public class Username {
	private String username;
	public boolean usernameValid(String username) {
		if(username.length()>12 && username.endsWith("_job")==true) {
			return false;
		}
		else if(username.length()>=12 && username.endsWith("_job")==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=sc.nextLine();
		Username u=new Username();
		boolean v=u.usernameValid(username);
		System.out.println(v);
		
	}

}
