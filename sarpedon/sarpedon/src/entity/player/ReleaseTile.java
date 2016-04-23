package entity.player;

import java.util.UUID;

public class ReleaseTile extends Tile {
	Integer rnumber; // the number associated with the instance of the Release Tile
	public enum Color {
		BLUE, GREEN, RED
	}
	Color rcolor; // the color of the instance of the ReleaseTile
	

	/** Gets the number assigned to the Tile */
	Integer getNumber(){
		return this.rnumber;
	}
	/** Gets the colour assigned to the Tile */
	Color getColor(){
		return this.rcolor;
	}
	/** Constructor with UUID provided */
	public ReleaseTile(Integer rw, Integer cl, UUID cvrd, Integer rnum, Color rcolr) {
		super(rw, cl, cvrd);
		rnumber = rnum;
		rcolor = rcolr;
	}
	/** Constructor without UUID */
	public ReleaseTile(Integer rw, Integer cl, Integer rnum, Color rcolr) {
		super(rw, cl);
		rnumber = rnum;
		rcolor = rcolr;
	}

	/** Provides a string representation of the Color */
	public String getColorString(){
		switch(this.rcolor){
		case BLUE:
			return "BLUE";
		case GREEN:
			return "GREEN";
		case RED:
			return "RED";
		default:
			throw new RuntimeException("entity.player::ReleaseTile: Unexpected Color");
		}
	}
}
