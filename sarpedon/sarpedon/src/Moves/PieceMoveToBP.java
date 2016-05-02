package Moves;

import control.builder.IMove;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

public class PieceMoveToBP implements IMove {

	Integer startX;
	Integer startY;
	Board b;
	Bullpen bP;
	Piece aPiece;

	public PieceMoveToBP(Integer startX, Integer startY, Board b, Bullpen bP, Piece P) {
		this.startX = startX;
		this.startY = startY;
		this.b = b;
		this.bP = bP;
		this.aPiece = P;
	}

	@Override
	public boolean undo() {
		if (!b.addPiece(startX, startY, aPiece))
		{
			System.out.print("Fail");
		}
		bP.removePiece(aPiece);
		return true;
	}
}