package entity.player;

import java.io.Serializable;
import java.util.UUID;
/**
 *  A basic component of a board.
 *  Contains the row and column where the tile is located as well as a unique identifier
 *  for the Piece covering the Tile or null if the Tile is not covered by a Piece.
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class Tile implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/** the row in where the lower right corner of the tile is */
	Integer row; 
	/** the column in where the lower right corner of the tile is */
	Integer col;
	/** the unique ID of the piece covering it */
	UUID coveredBy; 
	
	/** Constructor with UUID provided */
	public Tile(Integer rw, Integer cl, UUID cvrd){
		row = rw;
		col = cl;
		coveredBy = cvrd;
	}
	/** Constructor without UUID */
	public Tile(Integer rw, Integer cl){
		row = rw;
		col = cl;
		coveredBy = null;
	}
	
	/** Gets the row location of the Tile */
	public Integer getRow(){
		return this.row;
	}
	/** Gets the column location of the Tile */
	public Integer getColumn(){
		return this.col;
	}
	
	/** Gets the UUID of the Piece that covers the Tile */
	UUID getCoveredBy(){
		return this.coveredBy;
	}
	
	/** Sets the UUID of the Piece that covers the Tile */
	void setCoveredBy(UUID i){
		this.coveredBy = i;	
	}
	
	/** Checks if a location is over the tile, returns true if it is */
	boolean overTile(Integer rw, Integer cl){
		if ((rw <= this.row) && (rw > (this.row - 1)) && (cl <= this.col) && (cl > (this.col -1))){
			return true;
		}
		else return false;
	}

}
