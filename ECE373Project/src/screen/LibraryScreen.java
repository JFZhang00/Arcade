package screen;

import java.util.ArrayList;
import game.*;
import people.*;
import java.util.Scanner;

public class LibraryScreen extends Screen{ //Library screen that shows off the gaming collection
	private ArrayList<Game> library;
	
	public LibraryScreen() {
		library = new ArrayList<Game>();
	}
	
	public void playGame(Game g, User u, LeaderboardScreen l) { //Plays the game that is passed in by user. Playgame method deals with launching the game and the high score detection
		boolean playAgain = true;
		Scanner againResponse = new Scanner(System.in);
		String response;
		System.out.println("User "+ u.getName() + " is playing " + g.getName());
		//add to gamesPlayed for user
		if (u.getGamesPlayed().isEmpty() || u.detectAlreadyPlayed(g)) { //checks to see if the user has played before
			u.addGamesPlayed(g);
			u.setPersonalHigh(0);
		}
		
		while (playAgain == true) {//If player chooses to play again
			g.play();
			
			//detect personal high
			detectPersonalHigh(g.getScore(), g, u);
			
			//If top 10 scores
			detectHighScore(g.getScore(), g, u, l);
			g.playAgain();
			System.out.println("Play again? y/n"); //Checks to see if the user wants to play again
			response = againResponse.nextLine();
			if (response.toUpperCase().equals("Y")) {
				playAgain = true;
			} else {
				playAgain = false;
			}
		}
		g.reset(); //Resets the game as a whole
		
	}
	
	
	
	public void detectPersonalHigh(int rec, Game g, User u) { //Checks to see if new personal high is met
		if(rec >= u.getHighScores().get(u.getGamesPlayed().indexOf(g))) { //Compares score with current personal high
			System.out.println("New personal high!");
			u.getHighScores().set(u.getGamesPlayed().indexOf(g), g.getScore());
		}
	}
	
	public void detectHighScore(int rec, Game g, User u, LeaderboardScreen l) { //Looks through the leaderboard scorers to see whether the score is in the top 10
		if (l.getScorers().isEmpty()) {
			System.out.println("New high score!");
			l.getScorers().add(u);
		} else {
			for (int i = 0; i < l.getScorers().size(); i++) {
				if ((rec >= l.getScorers().get(i).getHighScores().get(l.getScorers().get(i).getGamesPlayed().indexOf(g)))) {
					System.out.println("New high score!");
					l.getScorers().add(i, u);
					break;
				}
			}
		}
	}
	
	public ArrayList<Game> getLibrary() { 
		return library;
	}
	
	public void addGame(Game game) { //Adds the game to library
		library.add(game);
		System.out.println(game.getName() + " has been added to library");
	}
	
}
