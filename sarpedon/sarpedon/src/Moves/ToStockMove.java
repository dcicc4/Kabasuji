package Moves;

import control.builder.IMove;
import entity.player.Bullpen;
import entity.player.Piece;

public class ToStockMove implements IMove{
	Bullpen bP;

	Piece aPiece;
	public ToStockMove(Bullpen bP, Piece aPiece){
		this.bP=bP;
		
		this.aPiece = aPiece;
	}
	public boolean undo()
	{
		bP.addPiece(aPiece);
		return true;
	}

}
