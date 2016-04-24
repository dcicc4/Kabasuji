package entity.player;

import java.util.UUID;

/**
 *  An extension of the base Tile class that encapsulates the additional data required
 *  for Tiles of ReleaseBoards
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class ReleaseTile extends Tile {
	private static final long serialVersionUID = 1L;
	/** the number associated with the instance of the Release Tile, or null if it has no number */
	Integer rnumber;
	public enum Color {
		BLUE, GREEN, RED, NONE
	}
	/** the color of the instance of the ReleaseTile */
	Color rcolor; 
	

	/** Gets the number assigned to the Tile */
	Integer getNumber(){
		return this.rnumber;
	}
	/** Gets the color assigned to the Tile */
	Color getColor(){
		return this.rcolor;
	}
	/** Constructor with UUID provided 
	 * @param rw the row in which the ReleaseTile is located
	 * @param cl the column in which the ReleaseTile is located
	 * @param cvrd the UUID of the piece that covers the ReleaseTile, or null if there is no Piece covering the Tile 
	 */
	public ReleaseTile(Integer rw, Integer cl, UUID cvrd, Integer rnum, Color rcolr) {
		super(rw, cl, cvrd);
		rnumber = rnum;
		rcolor = rcolr;
	}
	/** Constructor without UUID 
	 * @param rw the row in which the ReleaseTile is located
	 * @param cl the column in which the ReleaseTile is located
	 * @param cvrd the UUID of the piece that covers the Tile, or null if there is no Piece covering the Tile 
	 * @param rnum the number assigned to the ReleaseTile
	 * @param rcolr the color assigned to the ReleaseTile
	 */
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
		case NONE:
			return "NONE";
		default:
			throw new RuntimeException("entity.player::ReleaseTile: Unexpected Color");
		}
	}
}
