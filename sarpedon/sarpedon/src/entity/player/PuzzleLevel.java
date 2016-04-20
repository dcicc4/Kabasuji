package entity.player;

import java.util.ArrayList;

public class PuzzleLevel extends Level {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	Integer movesleft;
	
	public PuzzleLevel() {
		super();
	
	}

	void updateStars(){
		int s = this.bp.piecesLeft();
		if (s > 2){
			this.stars = 0;
			return;
		} else if (s == 2){
			this.stars = 1;
			return;
		} else if (s == 1){
			this.stars = 2;
		} else if (s == 0){
			this.stars = 3;
			return;
		} else {
			throw new RuntimeException("PuzzleLevel::updateStars: received incompatible bullpen");
		}
	}
}
