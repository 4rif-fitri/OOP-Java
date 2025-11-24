package MouseEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestMouseEvent implements MouseListener, MouseMotionListener {
	JLabel label = new JLabel("Message goes here");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("Test mouse");

	public void createAndShowGUI() {
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel.setBackground(Color.YELLOW);

		frame.add(panel, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);

		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
	}

public void mouseClicked (MouseEvent e) {
	label.setText("Clicked at ["+e.getX()+", "+e.getY()+"]");
}

	public void mousePressed(MouseEvent e) {
		label.setText("Pressed at [" + e.getX() + ", " + e.getY() + "]");
	}

	public void mouseReleased(MouseEvent e) {
		label.setText("Released at [" + e.getX() + ", " + e.getY() + "]");
	}

	public void mouseEntered(MouseEvent e) {
		label.setText("Mouse in panel");
	}



public void mouseExited (MouseEvent e) {
label.setText("Mouse outside panel");
}

	public void mouseDragged(MouseEvent e) {
		label.setText("Dragged at [" + e.getX() + "," + e.getY() + "]");
	}

	public void mouseMoved(MouseEvent e) {
		label.setText("Moved at [" + e.getX() + "," + e.getY() + "]");
	}

	public static void main(String[] args) {
		TestMouseEvent main = new TestMouseEvent();
		main.createAndShowGUI();
	}
}
