package week11;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tester {

	public void main() {
		JFrame jframe = new JFrame();
		JTextField button = new JTextField("press me");
		
		jframe.setSize(500, 300);
		jframe.setTitle("Good Morning");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
}
