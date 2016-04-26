package entity.player;

import java.util.UUID;
/**
 * the Lightning variant of a Board
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class LightningBoard extends Board {
	/**
	 * default constructor for the Lightning Board
	 */
	public LightningBoard() {
		super();
	}
	/** 
	 * Contructor for the Lightning Board
	 * @param s a two dimensional array of Tiles
	 */
	public LightningBoard(Tile[][] s){
		super(s);
	}
	/**
	 * Overrides base availableTile method to remove UUID check
	 * Pieces can overlap on LightningBoards
	 */
	@Override
	boolean availableTile(Integer row, Integer col){
		// check if out of bounds of rectangular representation of the board
		if ((row > shape[0].length - 1) || (col > shape.length - 1)){
			return false;
		}
		if ((row < 0) || (col < 0)){
			return false;
		}
//		System.out.println(shape[row][col]);
		if (shape[row][col] == null){
			return false; // location not a playable tile
		} else {
			return true;
		}
	}
	
	@Override
	boolean piecePlaceable(Integer row, Integer col, Piece p){
		boolean placeable = true;
		//if (availableTile(row, col)){
			for (Square s : p.dependent){
				int drow = row + s.xFromAnchor;
				int dcol = col + s.yFromAnchor;
				if (!availableTile(drow, dcol)){
					placeable = false;
				}
			}
		//} else {
		//	placeable = false;
		//}
			return placeable;
	}
	
	@Override
	public
	boolean addPiece(Integer row, Integer col, Piece p){
		if (piecePlaceable(row, col, p)){
			UUID pUUID = UUID.randomUUID(); // generating UUID for hash
			while (pieces.get(pUUID) != null){ // ensuring a unique UUID
				pUUID = UUID.randomUUID();
			}
			Tile t = shape[row][col];
			//t.setCoveredBy(pUUID); // mark the tile under the anchor as covered by the tile with this UUID
			for (Square s : p.dependent){ // mark the rest 
				int drow = row + s.xFromAnchor;
				int dcol = col + s.yFromAnchor;
				t = shape[drow][dcol];
				//if (availableTile(drow, dcol)){
					t.setCoveredBy(pUUID);
				//}
			}
			pieces.put(pUUID, p); // put mapping into hashmap
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public
	boolean removePiece(Integer row, Integer col){
		return false; // can't remove a piece in Lighting
	}

	@Override
	boolean movePiece(Integer startRow, Integer startCol, Integer endRow, Integer endCol){
		return false; // can't move a piece on a board in Lightning
	}
	

}
