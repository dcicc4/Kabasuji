package entity.player;

import java.util.ArrayList;

public class LightningLevel extends Level {
	Integer timeLeft;

	public LightningLevel(LightningBoard lboard, Bullpen bull, Integer strs,
			boolean cmplted, ArrayList<Hint> hnts, Integer tLeft) {
		super("Lightning");
		bullpen= bull;
		board = lboard;
		stars = strs;
		completed = cmplted;
		hints = hnts;
		timeLeft = tLeft;
	}
	public LightningLevel(){
		super("Lightning");
	}
	
	public Integer getTimeLeft(){
		return timeLeft;
	}
	public void decrementTime(){
		timeLeft--;
	}
	
	public void updateStars(){
		int spcLeft = ((LightningBoard)board).spacesLeft();
		if (spcLeft > 12){
			this.stars = 0;
			return;
		} else if (spcLeft > 6){
			this.stars = 1;
			return;
		} else if (spcLeft > 0){
			this.stars = 2;
			return;
		} else if (spcLeft == 0){
			this.stars = 3;
			return;
		} else {
			throw new RuntimeException("LightningLevel::updateStars: Error calculating stars");
		}
	}
	
	@Override
	public void restore(LevelMomento m){
		super.restore(m);
		timeLeft = m.timeAlotted;
	}

}
