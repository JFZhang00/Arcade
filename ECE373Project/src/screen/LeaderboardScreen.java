package screen;

import java.util.ArrayList;
import people.*;

public class LeaderboardScreen extends Screen{ //The leaderboard screen that holds the top scorers of games
	private ArrayList<User> scorers;
	
	public LeaderboardScreen() {
		scorers = new ArrayList<User>();
	}
	
	public ArrayList<User> getScorers(){
		return scorers;
	}
	
	public void setScorers(ArrayList<User> scorerList) {
		scorers = scorerList;
	}
	
	public void printScorers() { //Prints out the scorers
		for(int i = 0; i < scorers.size(); i++) {
			System.out.println(scorers.get(i).getName());
		}
	}
	
	
}
