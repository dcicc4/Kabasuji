package entity.builder;

import java.util.ArrayList;
import java.util.HashMap;
// This class is a stub till piece class is implemented
public class Board {
	Tile[][] shape;
	HashMap <Long, Piece> pieces;
	// add hashmap between piece ids and piece objects
	// assign id in piece constructor?
	// add and remove piece from board method
	// move piece on board method
	// move class?
	
	Piece getPiece(Integer row, Integer col){
		Tile t = shape[row][col];
		Integer tid = t.getCoveredBy();
		Piece p = pieces.get(tid);
		return p;
	}
	
	boolean availableTile(Integer row, Integer col){
		if ((row > shape[0].length) || (col > shape.length)){
			return false;
		}
		Tile t = shape[row][col];
		if (t == null){
			return false; // tile out of bounds
		}
		Integer tid = t.getCoveredBy();
		if (tid != null){
			return false; // tile already covered by another piece
		}
		else {
			return true; 
		}
	}
	
	boolean piecePlaceable(Integer row, Integer col, Piece p){
		boolean placeable = true;
		if (availableTile(row, col)){
			for (Square s : p.dependent){
				int drow = row + s.xFromAnchor;
				int dcol = col + s.yFromAnchor;
				if (!availableTile(drow, dcol)){
					placeable = false;
				}
			}
		}
		else {
			placeable = false;
		}
		return placeable;
	}
}
