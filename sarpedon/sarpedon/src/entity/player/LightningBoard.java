package entity.player;

import java.util.UUID;

public class LightningBoard extends Board {

	public LightningBoard() {
		super();
	}
	
	@Override
	boolean piecePlaceable(Integer row, Integer col, Piece p){
		boolean placeable = false;
		for (Square s : p.dependent){
			int drow = row + s.xFromAnchor;
			int dcol = col + s.yFromAnchor;
			if (availableTile(drow, dcol)){
				placeable = true;
			}
		}
		return placeable;
	}
	
	@Override
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
				if (availableTile(drow, dcol)){
					t.setCoveredBy(pUUID);
				}
			}
			pieces.put(pUUID, p); // put mapping into hashmap
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	boolean removePiece(Integer row, Integer col){
		return false; // can't remove a piece in Lighting
	}

	@Override
	boolean movePiece(Integer startRow, Integer startCol, Integer endRow, Integer endCol){
		return false; // can't move a piece on a board in Lightning
	}
}
