package Utils;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MatchSettings {
	@SuppressWarnings("unused")
	public static Match LoadMatchSettings(JFrame window) {
		JTextField organizer = new JTextField(10);
		JTextField side1 = new JTextField(10);
		JTextField side2 = new JTextField(10);
		JLabel organizerLabel = new JLabel("Organizer : ");
		JLabel side1Label = new JLabel("Team 1 : ");
		JLabel side2Label = new JLabel("Team 2 : ");
		JPanel newMatchPanel = new JPanel();
		newMatchPanel.setLayout(new BoxLayout(newMatchPanel, BoxLayout.Y_AXIS));
		newMatchPanel.add(organizerLabel);
		newMatchPanel.add(organizer);
		newMatchPanel.add(side1Label);
		newMatchPanel.add(side1);
		newMatchPanel.add(side2Label);
		newMatchPanel.add(side2);
		CInputPopUp matchPopup = new CInputPopUp(window, newMatchPanel, "Enter Match Data");
		return new Match(organizer.getText(), side1.getText(), side2.getText());
	}
}
