package entity.player;

import java.util.UUID;

public class Tile {
	// a tile with it's lower right corner denoted by the tuple (row, col)
	Integer row; 
	Integer col;
	UUID coveredBy; //stores the unique ID of the piece covering it
	
	public Tile(Integer rw, Integer cl, UUID cvrd){
		row = rw;
		col = cl;
		coveredBy = cvrd;
	}
	
	public Tile(Integer rw, Integer cl){
		row = rw;
		col = cl;
		coveredBy = null;
	}
	
	Integer getRow(){
		return this.row;
	}
	
	Integer getColumn(){
		return this.col;
	}
	
	UUID getCoveredBy(){
		return this.coveredBy;
	}
	
	void setCoveredBy(UUID i){
		if (i.compareTo(null) == 0){
			this.coveredBy = i;
		}
		else {
			throw new RuntimeException("CoveredBy cannot be set to a negative value!");
		}
	}
	
	// checks if a location is over the tile
	boolean overTile(Integer rw, Integer cl){
		if ((rw <= this.row) && (rw > (this.row - 1)) && (cl <= this.col) && (cl > (this.col -1))){
			return true;
		}
		else return false;
	}

}
