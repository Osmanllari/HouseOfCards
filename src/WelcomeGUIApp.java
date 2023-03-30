import javax.swing.JFrame;

public class WelcomeGUIApp {

	public static void main(String[] args) {
		JFrame frame = new WelcomeGUI();
		frame.pack();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1000, 600);
		frame.setResizable(false);
	}
}
