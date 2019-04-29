package gamePackage;

@SuppressWarnings("serial")
public class StartView extends View {

	private boolean tutorialClicked;
	private boolean startClicked;
	

	public StartView(Controller controller) {
		super(controller);
	}
	
	//Displays the bird image
	public void createBirdObject() {
		
	}
	
	//Draws the background that the game will display at the start
	@Override
	public void drawBackground() {
		
	}
	
	//Returns a boolean that detects if the tutorial button was clicked 
	public boolean getTutorialClicked() {
		return this.tutorialClicked;
	}
	
	//Returns a boolean that detects if the start game button was clicked
	public boolean getStartClicked() {
		return this.startClicked;
	}
}



