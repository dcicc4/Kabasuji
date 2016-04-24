package entity.player;

import java.util.ArrayList;
/**
 * Implementation of the abstract superclass Level for Puzzle Level
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class PuzzleLevel extends Level {

	private static final long serialVersionUID = 1L;
	/** the number of allowed moves left */
	Integer movesleft;
	
	/**
	 *  Default constructor, primarily used for testing purposes 
	 *  since Levels will be made in the level builder
	 */
	public PuzzleLevel(){
		this.brd = new Board();
		this.bp = new Bullpen();
		this.stars = 0;
		this.completed = false;
		this.hints = new ArrayList<Hint>();
		this.type = "Puzzle";
		this.number = 1;
		this.movesleft = 10; // arbitrary number to allow some testing
	}
	
	/**
	 * Constructor, primarily for testing purposes
	 * since Levels will be made in the level builder
	 * @param b the Board on which Pieces can be played
	 * @param bllpn the Bullpen from which Pieces can be played
	 * @param hnts a list of suggested locations for specific Pieces
	 */
	public PuzzleLevel(Board b, Bullpen bllpn, ArrayList<Hint> hnts){
		this.brd = b;
		this.bp = bllpn;
		this.hints = hnts;
		this.stars = 0;
		this.completed = false;
		this.type = "Puzzle";
		this.number = 1;
		this.movesleft = 10; // arbitrary number to allow some testing
		this.updateStars();
	}

	/**
	 * Calculates the number of stars earned and updates the stored value
	 */
	@Override
	public void updateStars(){
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
	
//	/**
//	 * Overrides base method to update before fetching the value
//	 */
//	@Override
//	public Integer getStars(){
//		updateStars();
//		return stars;
//	}
	/**
	 * Gets the number of moves left
	 * @return the number of moves left
	 */
	public Integer getMovesLeft(){
		return movesleft;
	}
	
}
