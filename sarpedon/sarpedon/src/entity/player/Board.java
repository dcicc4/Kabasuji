package entity.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Board {
	Tile[][] shape; // an array of tiles or null describing the shape of the board
	HashMap <UUID, Piece> pieces;
	// add and remove piece from board method
	// move piece on board method
	// move class?
	
	Piece getPiece(Integer row, Integer col){
		Tile t = shape[row][col];
		UUID tUUID = t.getCoveredBy();
		Piece p = pieces.get(tUUID);
		return p;
	}
	
	boolean availableTile(Integer row, Integer col){
		// check if out of bounds of rectangular representation of the board
		if ((row > shape[0].length) || (col > shape.length)){
			return false;
		}
		Tile t = shape[row][col];
		if (t == null){
			return false; // location not a playable tile
		}
		UUID tUUID = t.getCoveredBy();
		if (tUUID != null){
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
	boolean addPiece(Integer row, Integer col, Piece p){
		if (piecePlaceable(row, col, p)){
			UUID pUUID = UUID.randomUUID(); // generating UUID for hash
			while (pieces.get(pUUID) != null){ // ensuring a unique UUID
				pUUID = UUID.randomUUID();
			}
			Tile t = shape[row][col];
			t.setCoveredBy(pUUID); // mark the tile under the anchor as covered by the tile with this UUID
			for (Square s : p.dependent){ // mark the rest 
				int drow = row + s.xFromAnchor;
				int dcol = col + s.yFromAnchor;
				t = shape[drow][dcol];
				t.setCoveredBy(pUUID);
				}
			pieces.put(pUUID, p); // put mapping into hashmap
			return true;
		}
		else {
			return false;
		}
	}
	boolean removePiece(Integer row, Integer col){
		Tile t = shape[row][col];
		UUID pUUID = t.getCoveredBy();
		if (pUUID.compareTo(null)!=0){ // check if tile is covered
			for (Tile[] tileRow: shape){ // update coveredBy for tiles in shape
				for (Tile aTile: tileRow){
					if (aTile.getCoveredBy().compareTo(pUUID) == 0){
						aTile.setCoveredBy(null);
					}
				}
			}
			pieces.remove(pUUID); // remove mapping from hash
			return true;
		}
		else { // tried to remove a piece from a tile that is not covered
			return false;
		}
	}
}
