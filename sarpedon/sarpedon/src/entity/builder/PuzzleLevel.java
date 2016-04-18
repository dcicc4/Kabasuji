package entity.builder;

import java.util.ArrayList;

//import entity.builder.Hint;

public class PuzzleLevel extends LevelBuilder {
	Integer movesleft;
	
	public PuzzleLevel(Board board, Bullpen bullpen, ArrayList<Hint> hints) {
		super(board, "Puzzle", bullpen, hints);
		
	}

}
