
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel {

	public Home() {
		this.setBackground(Color.YELLOW);
		this.setLayout(new BorderLayout());

		JPanel container_home = new JPanel();
		container_home.setLayout(new BorderLayout());
		container_home.setBackground(Color.BLUE);

		JPanel container_content = new JPanel();
		container_content.setBackground(Color.CYAN);
		container_content.setLayout(new GridLayout(1,2));

		JPanel panel_kiri = new JPanel();
		JPanel panel_kanan = new JPanel();
		
		panel_kiri.setBackground(Color.GREEN);
		panel_kanan.setBackground(Color.DARK_GRAY);


		container_content.add(panel_kiri);
		container_content.add(panel_kanan);

		container_home.add(new JLabel("LOREM"), BorderLayout.NORTH);
		container_home.add(container_content);

		this.add(container_home);
	}
}
