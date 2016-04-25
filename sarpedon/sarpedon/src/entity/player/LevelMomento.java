package entity.player;

import java.io.Serializable;
import java.util.ArrayList;

import entity.builder.BuildableLightning;
import entity.builder.BuildablePuzzle;
import entity.builder.IBuilderModel;

public class LevelMomento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3727069688336446332L;

	
	/** A Board which describes what locations are playable and where Pieces are */
	Board board;
	/** A collection of Pieces that can be played on the Board */
	Bullpen bullpen;
	/** An indicator of progress through the level */
	Integer stars;
	/** whether or not the level is completed */
	boolean completed;
	/** a series of hints as to where specific Pieces should go */
	ArrayList <Hint> hints;
	/** the type of the Level: Lightning, Puzzle, or Release */
	String type;
	/** a number indicating the Level's position in the ordering for the overarching game */
	Integer number;
	/**a number indicating total time allowed in a lightning round*/
	Integer timeAlotted;
	/**a number indicating moves alotted in a puzzle round*/
	Integer movesAlotted;
	
	
	public LevelMomento(IBuilderModel m){
		board = m.getBoard();
		bullpen = m.getBullpen();
		stars = 0;
		completed = false;
		hints = m.getHints();
		type = m.getType();
		if(type.equals("Lightning")){
			timeAlotted = ((BuildableLightning)m).getTimeAlotted();
		}
		if(type.equals("Puzzle")){
			movesAlotted = ((BuildablePuzzle)m).getMovesAlotted();
		}
	}
	
	public String getType(){
		return type;
	}
	
}
