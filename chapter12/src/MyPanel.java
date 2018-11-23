import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		arg0.drawRect(50, 50, 100, 150);
		arg0.fillRect(70, 70, 50, 50);
		arg0.setColor(Color.RED);
		arg0.drawString("Good Morning", 150, 150);
	}
}
