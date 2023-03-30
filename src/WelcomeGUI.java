import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

//Class that creates the initial GUI
public class WelcomeGUI extends JFrame implements ActionListener{
	
	HouseOfCards cardGame;
	JPanel contentPane;
	JTextField tf1;
	String name;
	
	public WelcomeGUI() {
		
		cardGame = new HouseOfCards();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBounds(299, 5, 186, 34);
		mainPanel.add(playerPanel);
		
		JLabel lblNewLabel = new JLabel("Enter Player Name:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		playerPanel.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(490, 7, 186, 30);
		tf1.setFont(new Font("Arial", Font.PLAIN, 20));
		mainPanel.add(tf1);
		tf1.setColumns(10);
		
		JPanel gameRulesPanel = new JPanel();
		gameRulesPanel.setBounds(58, 99, 410, 300);
		mainPanel.add(gameRulesPanel);
		gameRulesPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Game Rules");
		lblNewLabel_1.setBounds(123, 5, 113, 24);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		gameRulesPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The game is played by one player with one deck of 52 cards.");
		lblNewLabel_2.setBounds(0, 53, 410, 31);
		gameRulesPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("There are four Houses in which the player will be placing cards.");
		lblNewLabel_2_1.setBounds(0, 94, 410, 31);
		gameRulesPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Achieve a total of 31 in the House by placing each card in one of them.");
		lblNewLabel_2_1_1.setBounds(0, 135, 410, 41);
		gameRulesPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("(Ace counts for 11, Kings, Queens, Jacks for 10).");
		lblNewLabel_2_1_1_1.setBounds(36, 156, 330, 31);
		gameRulesPanel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("If 31 is achieved, the player wins 100 points & House resets.");
		lblNewLabel_2_1_2.setBounds(0, 197, 410, 31);
		gameRulesPanel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("If one House\u2019s total exceeds 31, then this House is closed.");
		lblNewLabel_2_1_2_1.setBounds(0, 238, 410, 31);
		gameRulesPanel.add(lblNewLabel_2_1_2_1);
		
		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(506, 99, 400, 300);
		mainPanel.add(imagePanel);
		
	    JLabel imageLabel;
		Image image = new ImageIcon(this.getClass().getResource("./images/welcomeCards.png")).getImage();
    	imageLabel = new JLabel("");
    	imageLabel.setIcon(new ImageIcon(image));
    	imagePanel.add(imageLabel);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(176, 224, 230));
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		JLabel title = new JLabel("Welcome to the House Of Cards Game");
		title.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		topPanel.add(title);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(176, 224, 230));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton continueButton = new JButton("Continue");
		continueButton.addActionListener(this);
		continueButton.setFocusable(false);

		continueButton.setFont(new Font("Arial", Font.PLAIN, 20));
		bottomPanel.add(continueButton);
	}
	
  	public void actionPerformed (ActionEvent event) {
		String action = event.getActionCommand();
		if (action.equals("Continue")) {
		
		//Create the player object from the name provided by the user
		Player player = new Player(tf1.getText());
		
		dispose();
		HouseOfCardsGUI gameGUI = new HouseOfCardsGUI(player);
		gameGUI.setVisible(true);
		}
  	}
}
