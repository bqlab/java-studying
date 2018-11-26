package chapter8;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputTest {

	public static void main(String[] args) {
		FileOutputStream f;
		try {
			f = new FileOutputStream("first.dat");
			DataOutputStream d = new DataOutputStream(f);
			
			d.writeInt(1);
			d.writeDouble(1.0);
			d.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
