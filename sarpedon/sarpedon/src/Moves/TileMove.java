package Moves;

import control.builder.IMove;
import entity.player.Board;
import entity.player.Tile;

public class TileMove implements IMove{
Tile start;
Tile end;
Board aBoard;
	public TileMove(Tile start, Tile end, Board aBoard){
		this.start= start;
		this.end = end;
		this.aBoard = aBoard;
	}

	

	@Override
	public boolean undo() {
		aBoard.removeTile(end.getRow(), end.getColumn());
		aBoard.setTile(start);
		return true;
	}
}
