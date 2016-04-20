package entity.player;

public class Hint {
	Piece piece;
	Integer row;
	Integer column;
	//stub
	Hint(Piece pc, Integer rw, Integer clmn){
		piece = pc;
		row = rw;
		column = clmn;
	}
	
	public Piece getPiece(){
		return piece;
	}
	public Integer getRow(){
		return row;
	}
	public Integer getColumn(){
		return column;
	}

}
