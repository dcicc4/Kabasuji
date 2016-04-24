package entity.player;

import java.util.ArrayList;
/**
 * Implementation of the abstract superclass Level for the Lightning variation
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class LightningLevel extends Level {
	/** the amount of time left */
	Integer timeAllowed;

	/**
	 * Constructor, primarily for testing purposes
	 * since Levels will be made in the level builder
	 * @param lboard a LigntningBoard on which Pieces can be played
	 * @param bull a Bullpen from which Pieces can be played
	 * @param hnts a list of suggested locations for a selection of specific Pieces
	 * @param tLeft
	 */
	public LightningLevel(LightningBoard lboard, Bullpen bull, ArrayList<Hint> hnts, Integer tLeft) {
		this.brd = lboard;
		this.bp = bull;
		this.hints = hnts;
		this.stars = 0;
		this.completed = false;
		this.type = "Lightning";
		this.number = 2;
		this.timeAllowed = tLeft;
	}
	/**
	 * Calculates the number of stars earned based on the number of spaces left on the Board
	 * and updates the stored value
	 */
	@Override
	void updateStars(){
		int spcLeft = ((LightningBoard) this.brd).spacesLeft();
		if (spcLeft > 12){
			this.stars = 0;
			return;
		} else if (spcLeft > 6){
			this.stars = 2;
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

}
