package entity.player;

import java.util.ArrayList;

abstract public class Level {
	Board brd;
	Bullpen bp;
	Integer stars;
	boolean completed;
	ArrayList <Hint> hints;
	
	Level(Board board, Bullpen bull, Integer strs, boolean cmplted, ArrayList <Hint> hnts){
		brd = board;
		bp = bull;
		stars = strs;
		completed = cmplted;
		hints = hnts;
	}
	
	public Bullpen getBullpen(){
		return bp;
	}

}
