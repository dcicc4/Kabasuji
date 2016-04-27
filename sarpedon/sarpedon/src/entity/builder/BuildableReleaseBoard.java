package entity.builder;

import java.util.UUID;

import entity.player.Piece;
import entity.player.ReleaseBoard;
import entity.player.Square;
import entity.player.Tile;

public class BuildableReleaseBoard extends ReleaseBoard {
	public BuildableReleaseBoard() {
		super();
	}

public boolean removePiece(Integer row, Integer col){
	Tile t = shape[row][col];
	if (t == null){ return false;}
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

	}


