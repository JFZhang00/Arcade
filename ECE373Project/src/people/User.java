package people;

import java.util.ArrayList;

import game.Game;

public class User { //Super class of Guest and Player
	// attributes
	protected String name;
	protected boolean isGuest; // FIXME: add to UML
	protected ArrayList<Integer> highScores; // FIXME: data system for number + game bundled together?
	protected ArrayList<Game> gamesPlayed;
	
	// constructors
	public User() {
		this.name = "undefined";
		this.highScores = new ArrayList<Integer>();
		gamesPlayed = new ArrayList<Game>();
	}
	
	public User(String name) { //FIXME: does this need to be declared as public?
		this.name = name;
		this.highScores = new ArrayList<Integer>();
		gamesPlayed = new ArrayList<Game>();
	}
	
	// methods
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsGuest() { // FIXME: add to UML
		return this.isGuest;
	}
	public void setIsGuest(boolean isGuest) { // FIXME: add to UML
		this.isGuest = isGuest;
	}
	
	public void setPersonalHigh(int high) {
		highScores.add(high);
	}
	
	public int getPersonalHigh(Game g) {
		return 0;
	}
	
	public void addGamesPlayed(Game g) {
		gamesPlayed.add(g);
	}
	
	public ArrayList<Game> getGamesPlayed() {
		return gamesPlayed;
	}
	
	public ArrayList<Integer> getHighScores(){
		return highScores;
	}
	
	public boolean detectAlreadyPlayed(Game g) { //Detects if the user has already played the game. Prevents any duplicates and resetting of the gamesPlayed ArrayList. Called in library screen class
		for(int i = 0; i < getGamesPlayed().size(); i++) {
			if (getGamesPlayed().get(i).equals(g)) {
				return true;
			}
		}
		return false;
		
	}
	
	
}
