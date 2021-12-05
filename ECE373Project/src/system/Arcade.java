package system;

import java.util.ArrayList;

import people.*;

public class Arcade { //The arcade itself which holds the userList.
	private ArrayList<User> userList;
	
	public Arcade() {
		userList = new ArrayList<User>();
	}
	
	public ArrayList<User> getUserList(){
		return userList;
	}
	
	public void setUserList(ArrayList<User> list) {
		userList = list;
	}
	
	public void addUser(User u) {
		userList.add(u);
		if (u.getIsGuest() == true) {
			System.out.println("Guest is added to the database");
		} else if (u.getIsGuest() == false) {
			System.out.println("Player " + u.getName() + " is added to the database");
		}
		
	}
	
	
}
