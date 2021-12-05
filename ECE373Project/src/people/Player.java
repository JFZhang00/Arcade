package people;

import java.util.ArrayList;
import game.Game;

public class Player extends User { //Players have profiles which hold statistics. Inherits from User
	// attributes
	public int cakeDay; // FIXME: should we make a date object to reuse across the program instead?
	
	// constructors
//	public Player() {
//		this.highScores = new ArrayList<Integer>();
//		this.cakeDay = 0;
//		setIsGuest(false);
//	}
	
	public Player(String name, int cakeDay) {
		this.highScores = new ArrayList<Integer>();
		gamesPlayed = new ArrayList<Game>();
		this.setName(name);
		this.cakeDay = cakeDay;
		setIsGuest(false);
	}
	
	public Player(String name) {
		this.highScores = new ArrayList<Integer>();
		gamesPlayed = new ArrayList<Game>();
		this.setName(name);
		this.cakeDay = 0;
		setIsGuest(false);
	}
	
	// FIXME: should there be a way to load high scores into a player's data on construction?
	
	// methods
	public int getCakeDay() {
		return this.cakeDay;
	}
	public ArrayList<Integer> getHighScores() {
		return this.highScores;
	}
	public void setCakeDay(int cakeDay) {
		this.cakeDay = cakeDay;
	}
	public void addHighScore(Integer score) { // FIXME: needs an edit in the UML diagram
		this.highScores.add(score);
	}
	public int getPersonalHigh(Game g) { //Gets the personal high 
		return getHighScores().get(getGamesPlayed().indexOf(g));
	}
}
