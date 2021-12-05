package screen;

public abstract class Screen {//Super class for screen. This will mainly be impleented when GUIs are implemeted
	public Screen() {
		
	}
	
	public void goToHome() { //All of the screens have a way to go back to the home page.
		System.out.println("Going to home screen");
	}
}
