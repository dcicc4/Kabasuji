package entity.player;

public class Tile {
	// a tile with it's lower right corner denoted by the tuple (row, col)
	Integer row; 
	Integer col;
	Integer coveredBy; //stores the unique ID of the piece covering it
	
	public Tile(Integer rw, Integer cl, Integer cvrd){
		row = rw;
		col = cl;
		coveredBy = cvrd;
	}
	
	Integer getRow(){
		return this.row;
	}
	
	Integer getColumn(){
		return this.col;
	}
	
	Integer getCoveredBy(){
		return this.coveredBy;
	}
	
	// checks if a location is over the tile
	boolean overTile(Integer rw, Integer cl){
		if ((rw <= this.row) && (rw > (this.row - 1)) && (cl <= this.col) && (cl > (this.col -1))){
			return true;
		}
		else return false;
	}

}
