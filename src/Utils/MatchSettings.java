package Utils;

import javax.swing.*;

public class MatchSettings {
	@SuppressWarnings("unused")
	public static Match LoadMatchSettings(JFrame window) {
		JTextField organizer = new JTextField(10);
		JTextField side1 = new JTextField(10);
		JTextField side2 = new JTextField(10);
		JTextField ground = new JTextField(15);
		JLabel organizerLabel = new JLabel("Organizer : ");
		JLabel side1Label = new JLabel("Team 1 : ");
		JLabel side2Label = new JLabel("Team 2 : ");
		JLabel groundLabel = new JLabel("Ground");
		JLabel tossLabel = new JLabel("Toss");
		JPanel newMatchPanel = new JPanel();
		newMatchPanel.setLayout(new BoxLayout(newMatchPanel, BoxLayout.Y_AXIS));
		JPanel tossPanel = new JPanel();
		tossPanel.setLayout(new BoxLayout(tossPanel, BoxLayout.Y_AXIS));
		newMatchPanel.add(organizerLabel);
		newMatchPanel.add(organizer);
		newMatchPanel.add(side1Label);
		newMatchPanel.add(side1);
		newMatchPanel.add(side2Label);
		newMatchPanel.add(side2);
		newMatchPanel.add(groundLabel);
		newMatchPanel.add(ground);
		CInputPopUp matchPopup = new CInputPopUp(window, newMatchPanel, "Enter Match Data");
		tossPanel.add(tossLabel);
		String[] teamArray = {side1.getText(), side2.getText()};
		JComboBox<String> tossDropDown = new JComboBox<String>(teamArray);
		tossPanel.add(tossDropDown);
		String[] decision = {
			"Bat", "Bowl"
		};
		JComboBox<String> tossDecision = new JComboBox<String>(decision);
		tossPanel.add(tossDecision);
		CInputPopUp tossPopUp = new CInputPopUp(window, tossPanel, "Conduct the Toss");
		return new Match(organizer.getText(), side1.getText(), side2.getText(), ground.getText(), tossDropDown.getSelectedItem().toString(), tossDecision.getSelectedItem().toString());
	}
}
