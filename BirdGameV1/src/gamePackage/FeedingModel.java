package gamePackage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class FeedingModel extends Model {
	
	public FeedingModel(int w, int h, int iW, int iH) {
		super(w, h, iW, iH);
	}
	//detectCollisions() will contain the logic that determines if the bird model has collided with objects such as the ground and other obstacles
	@Override
	public boolean detectCollisions() {
		return false;
	}
	
	//updateLocationAndDirection() will contain the logic that allows the bird to move in the x or y direction based on user input
	@Override
	public void updateLocationAndDirection() {
		
	}
	
	//dive() will start the dive animation when the bird tries to catch a fish
	public void dive() {
		
	}
	
	//isHoldingFish() returns true if the bird is holding a fish else false
	public boolean isHoldingFish() {
		return false;
	}
}

//-----------------------------------------------------------------------------------------------------
