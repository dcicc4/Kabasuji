package entity.player;

import java.util.ArrayList;

public class LightningLevel extends Level {
	Integer timeLeft;

	public LightningLevel(LightningBoard lboard, Bullpen bull, Integer strs,
			boolean cmplted, ArrayList<Hint> hnts, Integer tLeft) {
		super(lboard, bull, strs, cmplted, hnts);
		timeLeft = tLeft;
		// stub
	}
	
	void updateStars(){
		
	}

}
