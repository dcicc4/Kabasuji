package entity.player;

import java.io.Serializable;
import java.util.ArrayList;

abstract public class Level implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -884584409157199554L;
	protected Board brd;
	protected Bullpen bp;
	protected Integer stars;
	protected boolean completed;
	protected ArrayList <Hint> hints;
	protected String type;
	
	public Level(){
		
	}
	
	public Bullpen getBullpen(){
		return bp;
	}
public String getType()
{
	return type;
}
}
