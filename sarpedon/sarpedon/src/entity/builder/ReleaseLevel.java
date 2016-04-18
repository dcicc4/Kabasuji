package entity.builder;

import java.util.ArrayList;

//import entity.builder.Hint;

public class ReleaseLevel extends LevelBuilder {
	
	
	public ReleaseLevel(Board board, Bullpen bullpen, ArrayList<Hint> hints) {
		super(board, "Release", bullpen, hints);
		
	}

}
