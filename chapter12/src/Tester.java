import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tester extends JFrame {
	public Tester() {
		this.setTitle("Hello");
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(new JButton("Press"), BorderLayout.NORTH);
		this.add(new MyPanel(), BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
	}
}
