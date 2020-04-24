package Lab6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
public class SerilizationDemo { 
	public static void main(String[] args) { 
		try {
	FileOutputStream fos=new FileOutputStream("D:/divya/product.txt"); 
	ObjectOutputStream oos=new ObjectOutputStream(fos); 
	
	ProductBean p1=new ProductBean(1001, "Mouse", 450); 
	ProductBean p2=new ProductBean(1002, "Keyboard", 650); 
	ProductBean p3=new ProductBean(1003, "HDMI Cable", 1450); 
	File myFile = new File("Product.txt");
	
	if (myFile.exists()) {
		System.out.println(myFile.getName() + " exists");
		System.out.println("The file is " + myFile.length() + " bytes long");
		if (myFile.canRead())
			System.out.println(" ok to read");
		else
			System.out.println(" not ok to read");
		if (myFile.canWrite())
			System.out.println(" ok to write");
		else
			System.out.println(" not ok to write");
		System.out.println("path: " +myFile.getAbsolutePath());
		System.out.println("File Name: "+ myFile.getName());
		System.out.println("File Size: "+ myFile.length() + " bytes");
	} 
	else
	{
		System.out.println("File does not exist");
	}
	
	System.out.println("Writing object into the stream"); 
	           oos.writeObject(p1); 
	           oos.writeObject(p2); 
	           oos.writeObject(p3); 
	           oos.close(); 		
	}catch (Exception e)
		{ 
		e.printStackTrace(); 
		} }	}


