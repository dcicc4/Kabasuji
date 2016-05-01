package Moves;

import control.builder.IMove;
import entity.player.Bullpen;
import entity.player.Piece;
import entity.player.PieceBuilder;


public class FromStockMove implements IMove{
	Bullpen bP;

	Piece aPiece;
	public FromStockMove(Bullpen bP, Piece aPiece){
		this.bP=bP;
		
		this.aPiece = aPiece;
	}
	public boolean undo()
	{
		bP.removePiece(aPiece);
		return true;
	}
}
