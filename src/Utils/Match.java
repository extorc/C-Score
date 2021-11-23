package Utils;

import java.util.*;

import javax.swing.JFrame;

import UI.CWindow;

public class Match {
    public MatchSettings matchSettings;

    public List<String> team1 = new ArrayList<String>();
    public List<String> team2 = new ArrayList<String>();
        
    public Match(JFrame window){
        this.matchSettings = MatchSettings.LoadMatchSettings(window);
        team1 = TeamSettings.LoadTeamSettings(window, team1);
        team2 = TeamSettings.LoadTeamSettings(window, team2);
        CWindow window2 = new CWindow("C-Score");
        window2.SetMaximized();
        window2.setVisible(true);
    }

    public void printData(){
        this.matchSettings.printData();
        for(String s : team1){
            System.out.println(s);
        }
        for(String s : team2){
            System.out.println(s);
        }
    }
}