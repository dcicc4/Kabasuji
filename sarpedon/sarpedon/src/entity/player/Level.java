package entity.player;

import java.io.Serializable;
import java.util.ArrayList;

abstract public class Level implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -884584409157199554L;
	Board brd;
	Bullpen bp;
	Integer stars;
	boolean completed;
	ArrayList <Hint> hints;
	
	public Level(){
		
	}
	
	public Bullpen getBullpen(){
		return bp;
	}

}
