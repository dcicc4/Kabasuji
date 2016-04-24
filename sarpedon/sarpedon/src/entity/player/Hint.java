package entity.player;
/**
 * A Hint is a suggested location for a specific Piece
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class Hint {
	/** The piece who's location is being suggested */
	Piece piece;
	/** The row in which the origin of the piece is suggested to be placed */
	Integer row;
	/** The column in which the origin of the piece is suggested to be placed */
	Integer column;
	
	/** The constructor of a Hint 
	 * @param pc the Piece being suggested
	 * @param rw the row in which the origin of the piece is suggested to be placed
	 * @param clmn the column in which the origin of the piece is suggested to be placed
	 */
	Hint(Piece pc, Integer rw, Integer clmn){
		piece = pc;
		row = rw;
		column = clmn;
	}
	/** Getter for the piece contained in the hint */
	public Piece getPiece(){
		return piece;
	}
	/** Getter for the row location of the hint */
	public Integer getRow(){
		return row;
	}
	/** Getter for the column location of the hint */
	public Integer getColumn(){
		return column;
	}

}
