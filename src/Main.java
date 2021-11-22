import UI.*;
import Utils.*;
import java.awt.event.*;

public class Main implements ActionListener{
	public static void main(String[] args) {
		CWindow window = new CWindow("C-Score");
		window.SetMaximized();
		CPanel panel = new CPanel();
		CButton newMatch = new CButton(0,0,100,25,"New Match");

		newMatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getActionCommand() == "New Match"){
					Match match = MatchSettings.LoadMatchSettings(window);
					match.printData();
					match = TeamSettings.LoadTeamSettings(window, match, 0);
					match = TeamSettings.LoadTeamSettings(window, match, 1);
				}
			}
		});
		panel.add(newMatch);
		window.add(panel);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
