package Utils;

import java.util.List;
import javax.swing.*;

public class TeamSettings {
	@SuppressWarnings({ "unused" })
	public static List<String> LoadTeamSettings(JFrame window , List<String> team) {
		JTextField player1 = new JTextField(10);
		JTextField player2 = new JTextField(10);
		JTextField player3 = new JTextField(10);
		JTextField player4 = new JTextField(10);
		JTextField player5 = new JTextField(10);
		JTextField player6 = new JTextField(10);
		JTextField player7 = new JTextField(10);
		JTextField player8 = new JTextField(10);
		JTextField player9 = new JTextField(10);
		JTextField player10 = new JTextField(10);
		JTextField player11 = new JTextField(10);
		JLabel mainLabel = new JLabel("Please enter the name of the players in the order of their batting");
		JLabel player1Label = new JLabel("Player 1 : ");
		JLabel player2Label = new JLabel("Player 2 : ");
		JLabel player3Label = new JLabel("Player 3 : ");
		JLabel player4Label = new JLabel("Player 4 : ");
		JLabel player5Label = new JLabel("Player 5 : ");
		JLabel player6Label = new JLabel("Player 6 : ");
		JLabel player7Label = new JLabel("Player 7 : ");
		JLabel player8Label = new JLabel("Player 8 : ");
		JLabel player9Label = new JLabel("Player 9 : ");
		JLabel player10Label = new JLabel("Player 10 : ");
		JLabel player11Label = new JLabel("Player 11 : ");
		JPanel newMatchPanel = new JPanel();
		newMatchPanel.setLayout(new BoxLayout(newMatchPanel, BoxLayout.Y_AXIS));
		newMatchPanel.add(mainLabel);
		newMatchPanel.add(player1Label);
		newMatchPanel.add(player1);
		newMatchPanel.add(player2Label);
		newMatchPanel.add(player2);
		newMatchPanel.add(player3Label);
		newMatchPanel.add(player3);
		newMatchPanel.add(player4Label);
		newMatchPanel.add(player4);
		newMatchPanel.add(player5Label);
		newMatchPanel.add(player5);
		newMatchPanel.add(player6Label);
		newMatchPanel.add(player6);
		newMatchPanel.add(player7Label);
		newMatchPanel.add(player7);
		newMatchPanel.add(player8Label);
		newMatchPanel.add(player8);
		newMatchPanel.add(player9Label);
		newMatchPanel.add(player9);
		newMatchPanel.add(player10Label);
		newMatchPanel.add(player10);
		newMatchPanel.add(player11Label);
		newMatchPanel.add(player11);
		CInputPopUp matchPopup = new CInputPopUp(window, newMatchPanel, "Enter Match Data");
		team.add(player1.getText());
		team.add(player2.getText());
		team.add(player3.getText());
		team.add(player4.getText());
		team.add(player5.getText());
		team.add(player6.getText());
		team.add(player7.getText());
		team.add(player8.getText());
		team.add(player9.getText());
		team.add(player10.getText());
		team.add(player11.getText());
		return team;
	}
}