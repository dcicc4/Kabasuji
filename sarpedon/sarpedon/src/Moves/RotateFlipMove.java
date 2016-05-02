package Moves;

import control.builder.IMove;
import entity.player.Bullpen;
import entity.player.Piece;

public class RotateFlipMove implements IMove{

	Piece aPiece;
	String Type;
	Bullpen bP;
	public RotateFlipMove (Piece aPiece, String Type)
	{
		this.aPiece = aPiece;
		this.Type = Type;
	}
	public boolean undo() {
	if (Type.equals("Clockwise"))
	{
		aPiece.rotateCounterClockwise();
	}
	if (Type.equals("Counter"))
	{
		aPiece.rotateClockwise();
	}
	if (Type.equals("Horizontal"))
	{
		aPiece.flipVertical();
	}
	if (Type.equals("Vertical"))
	{
		aPiece.flipHorizontal();
	}
		return true;
	}

}
