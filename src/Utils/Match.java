package Utils;

import java.util.*;

import javax.swing.JFrame;

public class Match {
    public MatchSettings matchSettings;

    public List<String> team1 = new ArrayList<String>();
    public List<String> team2 = new ArrayList<String>();
    
    public List<List<String>> teams = new ArrayList<List<String>>();
    
    public Match(JFrame window){
        this.matchSettings = MatchSettings.LoadMatchSettings(window);
        teams.add(team1);
        teams.add(team2);
    }
}