package chapter8;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileInputTest {

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("DAT Data", "data");
		chooser.showOpenDialog(filter);
		
		File file;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			file = chooser.getSelectedFile();
		else
			file = null;
		
		try {
			FileInputStream f = new FileInputStream("file.dat");
			DataInputStream d = new DataInputStream(f);
			
			System.out.println(d.readInt());
			System.out.println(d.readDouble());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
