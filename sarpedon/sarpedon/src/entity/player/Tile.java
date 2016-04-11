package entity.player;

public class Tile {
	Integer row;
	Integer col;
	boolean covered;
	
	public Tile(Integer rw, Integer cl, boolean cvrd){
		row = rw;
		col = cl;
		covered = cvrd;
	}
	
	boolean overTile(Integer rw, Integer cl){
		if ((rw <= this.row) && (rw > (this.row - 1)) && (cl <= this.col) && (cl > (this.col -1))){
			return true;
		}
		else return false;
	}

}
