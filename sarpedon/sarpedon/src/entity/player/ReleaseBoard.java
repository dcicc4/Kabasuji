package entity.player;

public class ReleaseBoard extends Board {

	public ReleaseBoard() {
		super();
	}

	@Override
	public
	boolean removePiece(Integer row, Integer col){
		return false; // pieces not removable in Release
	}
	
	@Override
	boolean movePiece(Integer startRow, Integer startCol, Integer endRwo, Integer endCol){
		return false; // pieces not movable after placement in Release
	}
}
