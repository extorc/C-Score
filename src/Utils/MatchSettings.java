package Utils;

import javax.swing.*;

public class MatchSettings {
	public String organizer, side1, side2, ground, tossVictor, tossdecision;

	public MatchSettings(String organizer,String side1,String side2,String ground,String tossVictor,String tossdecision){
		this.organizer = organizer;
		this.side1 = side1;
		this.side2 = side2;
		this.ground = ground;
		this.tossVictor = tossVictor;
		this.tossdecision = tossdecision;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getSide1() {
		return side1;
	}

	public void setSide1(String side1) {
		this.side1 = side1;
	}

	public String getSide2() {
		return side2;
	}

	public void setSide2(String side2) {
		this.side2 = side2;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

	public String getTossVictor() {
		return tossVictor;
	}

	public void setTossVictor(String tossVictor) {
		this.tossVictor = tossVictor;
	}

	public String getTossdecision() {
		return tossdecision;
	}

	public void setTossdecision(String tossdecision) {
		this.tossdecision = tossdecision;
	}
	public void printData(){
        System.out.println(this.getOrganizer() + ":" + this.getSide1() + " vs " + this.getSide2() + " At " + this.ground + " And toss Won by " + this.tossVictor + " And decided to " + this.tossdecision);
    }
	@SuppressWarnings("unused")
	public static MatchSettings LoadMatchSettings(JFrame window) {
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
		return new MatchSettings(organizer.getText(), side1.getText(), side2.getText(), ground.getText(), tossDropDown.getSelectedItem().toString(), tossDecision.getSelectedItem().toString());
	}
}