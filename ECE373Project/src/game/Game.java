package game;

import java.util.ArrayList;

import people.Player;

public class Game { //This is the super class for all the games that are going to be implemented
	
	/*
	 * Game ideas: Snake, Pong, boxes chasing cursor, 
	 */

	private String name; //Name of the game
	private ArrayList<Player> topScorers; //List of the top scorers of the game
	
	//Constructor
	public Game() { 
		this.name = "";
		topScorers = new ArrayList<Player>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Play method will get overridded by the game itself. Ex. TicTacToe overrides this
	public void play() {
		System.out.println("Launching game");
	}
	
	//Play Again method will get overridded by the game itself. Ex. TicTacToe overrides this
	public void playAgain() {
		System.out.println("Playing again");
	}
	
	//reset method will get overridded by the game itself. Ex. TicTacToe overrides this
	public void reset() {
		System.out.println("Resetting game");
	}
	
	//Get score will get overridded by the game itself. Ex. TicTacToe overrides this
	public int getScore() {
		System.out.println("Returning score");
		return 1;
	}
	
	
	
}
