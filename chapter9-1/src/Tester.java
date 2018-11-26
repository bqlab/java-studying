import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tester extends JFrame implements ActionListener {	
	private static final long serialVersionUID = 1L;
	private static Stack<Integer> stack;
	private static boolean operating;
	private static int op1, op2;
	
	JButton [] buttons;
	JLabel display;
	public Tester() {
		setTitle("12 buttons");
		setSize( 300, 400 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		makeUI();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		display.setText( arg0.getActionCommand() );
		stack.push(Integer.parseInt(arg0.getActionCommand()));
		if(arg0.getActionCommand().equals("+")) {
			op1 = stack.pop();
			operating = true;
		}
	}
	private void makeUI() {
		JPanel panel = new JPanel();
		buttons = new JButton[12];
		display = new JLabel("0", SwingConstants.RIGHT);
		display.setFont( new Font("ÈÞ¸Õ¿¾Ã¼",Font.BOLD, 32));
		display.setBackground(Color.green);
		display.setOpaque(true);
		panel.setLayout(new GridLayout( 4, 3 ));
		setLayout(new BorderLayout());
		for(int i=1; i<10; i++ ) {
			buttons[i] = new JButton( String.valueOf(i));
			panel.add( buttons[i] );
			buttons[i].addActionListener(this);
		}
		buttons[10] = new JButton("+");
		panel.add( buttons[10] );
		buttons[10].addActionListener(this);
		buttons[0] = new JButton("0");
		panel.add( buttons[0] );
		buttons[0].addActionListener(this);
		buttons[11] = new JButton("=");
		panel.add( buttons[11] );
		buttons[11].addActionListener(this);
		add( display, BorderLayout.NORTH);
		add( panel, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t = new Tester();
	}
}
