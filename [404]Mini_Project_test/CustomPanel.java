import java.awt.Color;
import java.io.File; // Needed to check if the file exists
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomPanel extends JPanel {

	public CustomPanel(Color c) {
		// Set up the panel's background
		this.setBackground(c);

		// Define the path relative to the execution directory
		String imagePath = "p1.png";

		// Check if the file exists before attempting to load (optional but helpful for
		// debugging)
		if (new File(imagePath).exists()) {
			ImageIcon img = new ImageIcon(imagePath);

			// Create a JLabel, set the icon, and add it to the panel
			JLabel imageLabel = new JLabel("Image Loaded:");
			imageLabel.setIcon(img);

			// Note: The text "Image Loaded:" will be next to the image
			// You can remove it if you only want the image: new JLabel(img)
			this.add(imageLabel);
		} else {
			// Display an error message if the file is not found
			this.add(new JLabel("Image not found: " + imagePath));
			System.err.println("File not found at: " + new File(imagePath).getAbsolutePath());
		}
	}
}