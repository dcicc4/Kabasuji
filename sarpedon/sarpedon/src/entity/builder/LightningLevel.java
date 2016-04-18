package entity.builder;

import java.util.ArrayList;

//import entity.builder.Hint;

public class LightningLevel extends LevelBuilder {
	Integer timeleft;
	
	public LightningLevel(Board board, Bullpen bullpen, ArrayList<Hint> hints) {
		super(board, "Lightning", bullpen, hints);
		
	}

}
