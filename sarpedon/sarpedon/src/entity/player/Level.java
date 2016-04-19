package entity.player;

import java.util.ArrayList;

abstract public class Level {
	Board brd;
	Bullpen bp;
	Integer stars;
	boolean completed;
	ArrayList <Hint> hints;
	
	public Level(){
		
	}

}
