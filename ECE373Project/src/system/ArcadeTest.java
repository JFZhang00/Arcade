package system;

import game.*;
import people.*;
import screen.*;
import game.tictactoe.*;

public class ArcadeTest { //Arcade tests that pieces everything together
	public static void main(String[] args) {
		//Boot arcade
		Arcade arc = new Arcade();
		
		//Create profile
		Player p1 = new Player("Jason");
		arc.addUser(p1);
		p1.setCakeDay(110100);
		Player p2 = new Player("Haseeb");
		arc.addUser(p2);
		p2.setCakeDay(120102);
		Player p3 = new Player("Patrick");
		arc.addUser(p3);
		p3.setCakeDay(1032530);
		
		//Create guest
		Guest g1 = new Guest();
		arc.addUser(g1);
		
		// Game library
		LibraryScreen libscr = new LibraryScreen();
		LeaderboardScreen leadscr = new LeaderboardScreen();
		
		//Add games to library
		TicTacToe ttt = new TicTacToe();
		ttt.setName("TicTacToe");
		libscr.addGame(ttt);
		
		//Play tictactoe game
		libscr.playGame(ttt, p1, leadscr);
		
		System.out.println(p2.getCakeDay());
		System.out.println(p1.getPersonalHigh(ttt));
		
		libscr.playGame(ttt, p2, leadscr);
		System.out.println(p2.getPersonalHigh(ttt));
		leadscr.printScorers();
		
		
		
	}
}
