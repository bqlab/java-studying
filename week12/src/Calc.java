import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calc extends JFrame implements ActionListener {
	JLabel label;
	public Calc() {
		setSize(300, 400);
		setTitle("°è»ê±â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeUI();
		setVisible(true);
	}
	private void makeUI() {
		JPanel panel = new JPanel();
		JButton[] buttons = new JButton[12];
		
		setLayout(new BorderLayout());
		label = new JLabel("0");
		add(label, BorderLayout.NORTH);
		
		panel.setLayout(new GridLayout(4,3));
		
		for(int i=1; i<10; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		
		buttons[0] = new JButton("0");
		buttons[10] = new JButton("+");
		buttons[11] = new JButton("=");
		
		panel.add(buttons[10]);
		panel.add(buttons[0]);
		panel.add(buttons[11]);
		
		buttons[0].addActionListener(this);
		buttons[10].addActionListener(this);
		buttons[11].addActionListener(this);
		
		add(panel, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		Calc calc = new Calc();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		label.setText(((JButton)arg0.getSource()).getText());
	}
}
