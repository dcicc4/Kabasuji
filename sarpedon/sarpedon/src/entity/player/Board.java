package entity.player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * A Board entity object.
 * Contains:
 * shape = a two dimensional array with tiles where the board is playble and null, elsewhere
 * pieces = a hash of UUIDs to pieces
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class Board implements Serializable{
	private static final long serialVersionUID = -6584127615090719915L;
	/** an array of tiles or null describing the shape of the board 
	 * playable locations on the board are represented by a tile 
	 * non playable locations on the board are marked with null */
	Tile[][] shape; 
	/** a mapping of pieces to uuid's stored in tiles */
	HashMap <UUID, Piece> pieces; 
	
	 boolean movingTile = false;
	/** default constructor, a 12 x 12 board of tiles */
	public Board(){
		shape = new Tile[12][12];
		for(int i=0; i< 12; i++){
			for(int j =0; j<12;j++){
				shape[i][j]	= new Tile(i,j);
			}
		}
		pieces = new HashMap<UUID, Piece>();
	}
	
	/** constructor taking a two dimensional array of Tiles describing the shape */
	public Board(Tile[][] s){
		// enforce size restriction, array must be at least 1 x 1 and less than 12 x 12
		if ((s.length <= 12)&&(s.length>=1)){
			if ((s[0].length <= 12)&&(s[0].length >=1)){
				shape = s;
				}
		} else {
			throw new RuntimeException("entity.player::Board: invalid board array");
		}
		pieces = new HashMap<UUID, Piece>();
	}

	/** looks up the Piece covering a given location, returns null if no piece present */
	public Piece getPiece(Integer row, Integer col){
		Tile t = shape[row][col];
		if(t == null){return null;}
		UUID tUUID = t.getCoveredBy();
		if (tUUID != null){
			Piece p = pieces.get(tUUID);
			return p;
		} else {
			return null; // could instead throw an exception?
		}
	}
	
	/** getter for shape */
	public Tile[][] getTileArray(){
		return shape;
	}
	
	public boolean getMovingTile(){
		return movingTile;
	}
	public void setMovingTile(boolean b){
		movingTile = b;
	}
	public Tile getTile(int row, int col){
		return shape[row][col];
	}
	public void setTile(Tile t){
		shape[t.getRow()][t.getColumn()] = t;
	}
	public void removeTile(int row, int column){
		shape[row][column] = null;
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
		//if (availableTile(row, col)){
			for (Square s : p.dependent){
				int drow = row + s.xFromAnchor;
				int dcol = col + s.yFromAnchor;
				if (!availableTile(drow, dcol)){
					placeable = false;
				}
			}
		//}
		//else {
		//	placeable = false;
		//}
		return placeable;
	}
	
	public boolean addPiece(Integer row, Integer col, Piece p){
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
				t.setCoveredBy(pUUID);
				}
			pieces.put(pUUID, p); // put mapping into hashmap
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removePiece(Integer row, Integer col){
		Tile t = shape[row][col];
		UUID pUUID = t.getCoveredBy();
		if (pUUID != null){ // check if tile is covered
			for (Tile[] tileRow: shape){ // update coveredBy for tiles in shape
				for (Tile aTile: tileRow){
					if(aTile != null){
						if (aTile.getCoveredBy() == pUUID){
							aTile.setCoveredBy(null);
						}
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
	
	boolean movePiece(Integer startRow, Integer startCol, Integer endRow, Integer endCol){
		Piece p = getPiece(startRow, startCol);
		if (p!= null){ // check that there is a piece at the start location
			if(piecePlaceable(endRow, endCol, p)){ // check that the end location is placeable
				addPiece(endRow, endCol, p); // add the piece to the new location
				removePiece(startRow, startCol); // remove the piece from the old location
				return true;
			}
			else {
				return false; // end location not valid
			}
		}
		else {
			return false; // there was no starting piece
		}
	}
	
	void removeAll(){
		for (Tile[] tileRow: shape){ // clear coveredBy for all tiles
			for (Tile aTile: tileRow){
				aTile.setCoveredBy(null);
			}
		}
		pieces.clear();	 // removes all mappings from hashmap
	}
	/**
	 * Returns the number of tiles in the board.
	 * @return int representing how many tiles in the board
	 */
	public int getSize() {
		int size = 0;
		for (Tile[] tileRow: shape){ // clear coveredBy for all tiles
			for (Tile aTile: tileRow){
				if (aTile != null){
					size++;
				}
			}
		}
		return size;
	}
	
}
