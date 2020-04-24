package lab8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable {
	@Override
	public void run() {
		int read;
		int c=0;
		try {
			FileReader reader=new FileReader("source.txt");
			FileWriter writer=new FileWriter("target.txt");
			
			while((read=reader.read())!=-1) {
				//c=0;
				if(true) {
					
					writer.write(read);
					writer.flush();
					
					c++;
					if(c==10) {
						c=0;
						System.out.println("10 characters are copied");
						Thread.sleep(500);
						
					}
					
				}
			}
		}catch(FileNotFoundException e) {
			System.err.println("file not find");;
		}
		catch(IOException k) {
			k.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		
		
	}

