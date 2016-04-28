package Moves;

import control.builder.IMove;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

public class PieceMoveToBoard implements IMove {

Integer endX;
Integer endY;
Board b;
Bullpen bP;
Piece aPiece;


public  PieceMoveToBoard(Integer endX, Integer endY, Board b, Bullpen bP, Piece P){
	this.endX = endX;
	this.endY = endY;
	this.b = b;
	this.bP = bP;
	this.aPiece = P;
}

public boolean undo() {
	
	bP.addPiece(aPiece);
	b.removePiece(endX, endY);
	return true;
}
}
