package week11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class MyFrame extends JFrame {
	JButton[] buttons;
	
	public MyFrame() {
		setTitle("hello");
		setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void makeButtons() {
		buttons = new JButton[12];
		for(int i=1;i<=9;i++) 
			buttons[i] = new JButton(String.valueOf(i));
		buttons[0] = new JButton(String.valueOf(0));
		buttons[10] = new JButton("+");
		buttons[11] = new JButton("=");
		
		for(int i = 0; i<12;i++) {
			add(buttons[i]);
		}
	}
	
	public static void main(String[] argv){
		MyFrame frame = new MyFrame();
	}
}