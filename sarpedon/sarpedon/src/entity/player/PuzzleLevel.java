package entity.player;

import java.util.ArrayList;

public class PuzzleLevel extends Level {
	Integer movesleft;
	
	public PuzzleLevel(Board board, Bullpen bull, Integer strs,
			boolean cmplted, ArrayList<Hint> hnts, Integer mvslft) {
		super(board, bull, strs, cmplted, hnts);
		movesleft = mvslft;
		// stub
	}

}
