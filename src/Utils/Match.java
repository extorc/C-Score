package Utils;

import java.util.List;
import java.util.ArrayList;

public class Match {
    private String organizer;
    private String side1;
    private String side2;

    
    public List<String> team1 = new ArrayList<String>();
    public List<String> team2 = new ArrayList<String>();
    
    public List<List<String>> teams = new ArrayList<List<String>>();
    
    public Match(String organizer, String side1, String side2){
        this.organizer = organizer;
        this.side1 = side1;
        this.side2 = side2;
        teams.add(team1);
        teams.add(team2);
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

    public void printData(){
        System.out.println(this.getOrganizer() + ":" + this.getSide1() + " vs " + this.getSide2());
    }
}
