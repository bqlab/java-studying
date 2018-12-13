import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Tester extends JFrame implements ActionListener {	
	JButton [] buttons;
	JLabel display;
	Stack<String> eq;
	int a = 0, b = 0, flag = 1;
	
	public Tester() {
		setTitle("12 buttons");
		setSize( 300, 400 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		makeUI();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		String s = button.getText();
		display.setText(s);
		
		if(s.equals("=")) {
			try {
				b = Integer.parseInt(eq.pop());
				display.setText(Integer.toString(a+b));
				eq.clear();
				a = b = 0;
				flag = 1;
			} catch (EmptyStackException e1) {
				display.setText("입력 오류");
				eq.clear();
			}
		}
		else if (s.equals("+")) {
			try {
				a = Integer.parseInt(eq.pop());
			} catch (EmptyStackException e1) {
				display.setText("입력 오류");
				eq.clear();
			}
		}
		else {
			eq.push(s);
		}
	}
	private void makeUI() {
		eq = new Stack<String>();
		JPanel panel = new JPanel();
		buttons = new JButton[12];
		display = new JLabel("계산기", SwingConstants.RIGHT);
		display.setFont( new Font("굴림",Font.BOLD, 32));
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
