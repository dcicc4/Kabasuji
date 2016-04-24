package entity.player;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *  A Level contains the objects necessary to play a round in the game
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
abstract public class Level implements Serializable {
	
	private static final long serialVersionUID = -884584409157199554L;
	/** A Board which describes what locations are playable and where Pieces are */
	protected Board brd;
	/** A collection of Pieces that can be played on the Board */
	protected Bullpen bp;
	/** An indicator of progress through the level */
	protected Integer stars;
	/** whether or not the level is completed */
	protected boolean completed;
	/** a series of hints as to where specific Pieces should go */
	protected ArrayList <Hint> hints;
	/** the type of the Level: Lightning, Puzzle, or Release */
	protected String type;
	/** a number indicating the Level's position in the ordering for the overarching game */
	protected Integer number;
	
	
	/**
	 * Gets the Bullpen of the level
	 * @return the Bullpen of the Level
	 */
	public Bullpen getBullpen(){
		return bp;
	}
	
	/**
	 * Gets the type of the Level (Lightning, Puzzle, or Release)
	 * @return a String representing the type of the Level
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * Gets whether a Level has been completed
	 * @return true if the Level has been completed, otherwise false
	 */
	public boolean getCompleted(){
		updateStars();
		if (this.stars == 3){
			completed = true;
		} else {
		}
		return completed;
	}
	/**
	 * Manually sets whether the level has been completed
	 * @param b true to set the level as completed
	 */
	public void setCompleted(boolean b){
		completed = b;
	}
	/**
	 * Gets how many Stars have been earned on the Level
	 * @return an integer representing the number of stars earned thus far
	 */
	public Integer getStars(){
		updateStars();
		return stars;
	}
	/**
	 * should be overridden by subclasses, calculates stars
	 */
	void updateStars(){
	}
	/**
	 * Gets the Board of the Level
	 * @return the Board of the Level
	 */
	public Board getBoard(){
		return brd;
	}
	/**
	 * Gets the Hints associated with the Level
	 * @return a list of Hints associated with the Level
	 */
	public ArrayList<Hint> getHints(){
		return hints;
	}
	/**
	 * Gets the number of the Level
	 * @return an integer representing the Level's position in the play order of the game
	 */
	public Integer getNumber(){
		return number;
	}
	/**
	 * Sets the Level's position in the play order of the game
	 * @param num which position in the play order of the game the Level is being assigned
	 */
	public void setNumber(Integer num){
		if ((num < 15)&&(num>=0)){
			number = num;
		} else {
			throw new RuntimeException("entity.player::Level::setNumber: number out of range");
		}
	}
}
