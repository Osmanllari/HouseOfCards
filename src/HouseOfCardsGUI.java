import javax.swing.*;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//This is the second GUI (page) of the program, where the actual game is played
public class HouseOfCardsGUI extends JFrame implements ActionListener {

	HouseOfCards cardGame;
	House h1, h2, h3, h4;
	Deck gameDeck;
	Card currentCard;
	Player player;
	JPanel contentPane, activeCardView, mainPanel;
	JButton btnHouseOne, btnHouseTwo, btnHouseThree, btnHouseFour, btnEndGameButton;
	JLabel playerNameLabel, playerPointsLabel, cardsLeftNumberLabel;
	ImageIcon activeCard;
	JLabel activeCardLabel;	

	public HouseOfCardsGUI(Player player) {

		cardGame = new HouseOfCards();
		cardGame.addPlayer(player);

		h1 = new House();
		cardGame.addHouse(h1);

		h2 = new House();
		cardGame.addHouse(h2);

		h3 = new House();
		cardGame.addHouse(h3);

		h4 = new House();
		cardGame.addHouse(h4);

		gameDeck = new Deck();
		cardGame.addDeck(gameDeck);

		gameDeck.shuffleDeck();
		currentCard = gameDeck.dealCard();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(152, 251, 152));
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);

		JLabel lbHouseOne = new JLabel("House #1");
		lbHouseOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbHouseOne.setBounds(210, 466, 100, 25);
		mainPanel.add(lbHouseOne);

		JLabel lbHouseTwo = new JLabel("House #2");
		lbHouseTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbHouseTwo.setBounds(365, 466, 100, 25);
		mainPanel.add(lbHouseTwo);

		JLabel lbHouseThree = new JLabel("House #3\r\n");
		lbHouseThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbHouseThree.setBounds(520, 466, 100, 25);
		mainPanel.add(lbHouseThree);

		JLabel lbHouseFour = new JLabel("House #4");
		lbHouseFour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbHouseFour.setBounds(670, 466, 100, 25);
		mainPanel.add(lbHouseFour);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0));
		panel_2.setBounds(210, 344, 100, 18);
		mainPanel.add(panel_2);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.RED);
		panel_2_1.setBounds(225, 334, 70, 18);
		mainPanel.add(panel_2_1);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.RED);
		panel_2_1_1.setBounds(240, 324, 40, 18);
		mainPanel.add(panel_2_1_1);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.RED);
		panel_2_2.setBounds(670, 344, 100, 18);
		mainPanel.add(panel_2_2);

		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(Color.RED);
		panel_2_1_2.setBounds(685, 334, 70, 18);
		mainPanel.add(panel_2_1_2);

		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(Color.RED);
		panel_2_1_1_1.setBounds(700, 324, 40, 18);
		mainPanel.add(panel_2_1_1_1);

		//Buttons that represent the houses
		btnHouseOne = new JButton("0");
		btnHouseOne.addActionListener(this);
		btnHouseOne.setBackground(SystemColor.info);
		btnHouseOne.setMargin(new Insets(0, 0, 0, 0));
		btnHouseOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHouseOne.setBounds(210, 358, 100, 100);
		btnHouseOne.setFocusable(false);
		mainPanel.add(btnHouseOne);

		btnHouseTwo = new JButton("0");
		btnHouseTwo.addActionListener(this);
		btnHouseTwo.setBackground(new Color(255, 204, 153));
		btnHouseTwo.setMargin(new Insets(0, 0, 0, 0));
		btnHouseTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHouseTwo.setBounds(365, 358, 100, 100);
		btnHouseTwo.setFocusable(false);
		mainPanel.add(btnHouseTwo);

		btnHouseThree = new JButton("0");
		btnHouseThree.addActionListener(this);
		btnHouseThree.setBackground(new Color(216, 191, 216));
		btnHouseThree.setMargin(new Insets(0, 0, 0, 0));
		btnHouseThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHouseThree.setBounds(520, 358, 100, 100);
		btnHouseThree.setFocusable(false);
		mainPanel.add(btnHouseThree);

		btnHouseFour = new JButton("0");
		btnHouseFour.addActionListener(this);
		btnHouseFour.setBackground(new Color(204, 255, 255));
		btnHouseFour.setMargin(new Insets(0, 0, 0, 0));
		btnHouseFour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHouseFour.setBounds(670, 358, 100, 100);
		btnHouseFour.setFocusable(false);
		mainPanel.add(btnHouseFour);

		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.RED);
		panel_2_3.setBounds(365, 344, 100, 18);
		mainPanel.add(panel_2_3);

		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBackground(Color.RED);
		panel_2_1_3.setBounds(380, 334, 70, 18);
		mainPanel.add(panel_2_1_3);

		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBackground(Color.RED);
		panel_2_1_1_2.setBounds(395, 324, 40, 18);
		mainPanel.add(panel_2_1_1_2);

		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(Color.RED);
		panel_2_4.setBounds(520, 344, 100, 18);
		mainPanel.add(panel_2_4);

		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setBackground(Color.RED);
		panel_2_1_4.setBounds(535, 334, 70, 18);
		mainPanel.add(panel_2_1_4);

		JPanel panel_2_1_1_3 = new JPanel();
		panel_2_1_1_3.setBackground(Color.RED);
		panel_2_1_1_3.setBounds(550, 324, 40, 18);
		mainPanel.add(panel_2_1_1_3);

		//The panel that displays the rear card image
		JPanel backOfCardView = new JPanel();
		backOfCardView.setBounds(265, 10, 200, 290);
		mainPanel.add(backOfCardView);

		JLabel imageLabel;
		Image backOfCard = new ImageIcon(this.getClass().getResource("./images/BackOfCardImage.png")).getImage();
		Image imgScale = backOfCard.getScaledInstance(backOfCardView.getWidth(), backOfCardView.getHeight(), Image.SCALE_SMOOTH);
		backOfCardView.setLayout(null);

		imageLabel = new JLabel("");
		imageLabel.setBounds(0, 0, 200, 290);
		imageLabel.setIcon(new ImageIcon(imgScale));
		backOfCardView.add(imageLabel);

		//The panel that displays the active card image
		activeCardView = new JPanel();
		activeCardView.setBackground(new Color(152, 251, 152));
		activeCardView.setBounds(520, 10, 200, 290);
		mainPanel.add(activeCardView);

		activeCard = currentCard.getCardImage();
		activeCardView.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		activeCardLabel = new JLabel("");
		activeCardLabel.setBounds(0, 0, 200, 290);

		activeCardLabel.setIcon(activeCard);
		activeCardView.add(activeCardLabel);

		JLabel playerLabel = new JLabel("Player:");
		playerLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		playerLabel.setBounds(10, 40, 56, 36);
		mainPanel.add(playerLabel);

		JLabel pointsLabel = new JLabel("Points:");
		pointsLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pointsLabel.setBounds(10, 97, 56, 36);
		mainPanel.add(pointsLabel);

		//Label that displays the player name
		playerNameLabel = new JLabel("name");
		playerNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		playerNameLabel.setBounds(60, 40, 195, 36);
		mainPanel.add(playerNameLabel);
		playerNameLabel.setText(player.getName());

		//Label that displays the current player points
		playerPointsLabel = new JLabel("0");
		playerPointsLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		playerPointsLabel.setBounds(60, 97, 78, 36);
		mainPanel.add(playerPointsLabel);

		//Label that displays the current cars left
		cardsLeftNumberLabel = new JLabel("52\r\n");
		cardsLeftNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cardsLeftNumberLabel.setBounds(941, 40, 25, 36);
		mainPanel.add(cardsLeftNumberLabel);

		JLabel cardsLabel = new JLabel("Card's left:");
		cardsLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cardsLabel.setBounds(864, 40, 78, 36);
		mainPanel.add(cardsLabel);
		
		btnEndGameButton = new JButton("End Game");
		btnEndGameButton.addActionListener(this);
		btnEndGameButton.setFocusable(false);
		btnEndGameButton.setBounds(864, 107, 102, 21);
		mainPanel.add(btnEndGameButton);

		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(47, 79, 79));
		contentPane.add(topPanel, BorderLayout.NORTH);

		JTextPane txtpnHouseOfCards = new JTextPane();
		txtpnHouseOfCards.setForeground(new Color(255, 255, 255));
		txtpnHouseOfCards.setBackground(new Color(47, 79, 79));
		txtpnHouseOfCards.setEditable(false);
		txtpnHouseOfCards.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		txtpnHouseOfCards.setText("House Of Cards");
		topPanel.add(txtpnHouseOfCards);
		setResizable(false);
	}

	public void actionPerformed (ActionEvent event) {
		
		JButton bt = (JButton)event.getSource();
		player = cardGame.getPlayer();
		
		if(cardGame.checkAllHouses(h1,h2,h3,h4) && (gameDeck.deckSize() >= 0)) {
			
			if(bt.equals(btnHouseOne) && h1.isAvailable()) {
				updateGame(h1);
				btnHouseOne.setText(h1.getCurrentValue() + "");
				updateHouseVisually(h1);
			}
			else if(bt.equals(btnHouseTwo) && h2.isAvailable()) {
				updateGame(h2);
				btnHouseTwo.setText(h2.getCurrentValue() + "");
				updateHouseVisually(h2);
			}
			else if (bt.equals(btnHouseThree) && h3.isAvailable()) {
				updateGame(h3);
				btnHouseThree.setText(h3.getCurrentValue() + "");
				updateHouseVisually(h3);
			}
			else if (bt.equals(btnHouseFour) && h4.isAvailable() ){
				updateGame(h4);
				btnHouseFour.setText(h4.getCurrentValue() + "");
				updateHouseVisually(h4);
			}
			else if (bt.equals(btnEndGameButton)) 
			{
				newGame();
			}
		}
		else {
			JOptionPane.showMessageDialog(this.mainPanel, "Game ended!\n" + player.getName() + ", lost!");
			newGame();

		}

	}
	
	//Method for updating the game after each button click (labels, points, cards left, active card image)
	public void updateGame(House house) {
		house.placeCard(currentCard);
		cardsLeftNumberLabel.setText(gameDeck.deckSize() + "");
		house.calculateHouse(player);
		playerPointsLabel.setText(cardGame.getPlayer().getPoints() + "");
		
		//If a player gets points with the last card, it is counted
		if(gameDeck.deckSize() > 0) {
			currentCard = gameDeck.dealCard();
			activeCardLabel.setIcon(currentCard.getCardImage());
		}
		else {
			activeCardLabel.setIcon(null);
			playerPointsLabel.setText(cardGame.getPlayer().getPoints() + "");
			JOptionPane.showMessageDialog(this.mainPanel, "Game ended!\n" + player.getName() + ", won with: " + player.getPoints() + " points!");
			newGame();
		}
	}
	
	//Method to go back to the WelcomeGUI (initial page)
	public void newGame() {
		dispose();
		WelcomeGUI welcomePage = new WelcomeGUI();
		welcomePage.setVisible(true);
	}
	
	//Method for updating the appearance of an unavailable House based on the button clicked (color and informing message dialog)
	public void updateHouseVisually(House house) {
		if(house == h1 && h1.isAvailable() == false) 
		{
			btnHouseOne.setBackground(Color.GRAY);
			JOptionPane.showMessageDialog(this.mainPanel,"House #1 is unavailable");
		}
		else if (house == h2 && h2.isAvailable() == false)
		{
			btnHouseTwo.setBackground(Color.GRAY);
			JOptionPane.showMessageDialog(this.mainPanel,"House #2 is unavailable");
		}
		else if (house == h3 && h3.isAvailable() == false)
		{
			btnHouseThree.setBackground(Color.GRAY);
			JOptionPane.showMessageDialog(this.mainPanel,"House #3 is unavailable");
		}
		else if(house == h4 && h4.isAvailable() == false) {
			btnHouseFour.setBackground(Color.GRAY);
			JOptionPane.showMessageDialog(this.mainPanel,"House #4 is unavailable");
		}
	}
	
}

