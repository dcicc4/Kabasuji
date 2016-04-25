package entity.player;

import junit.framework.TestCase;

public class LightningBoardTest extends TestCase {
	/** a 12 x 12 Tile array */
	Tile[][] shapeFull;
	/** a 12 x 12 Tile array with odd rows empty */
	Tile[][] shapeOddsEmpty;
	
	/** pieces for use in testing */
	Piece verticalBar = new Piece(1,  new Square(0, 1), new Square(0, 2), new Square(0, 3), new Square(0, 4), new Square(0, 5) );
	Piece horizontalBar = new Piece(1,  new Square(1, 0), new Square(2, 0), new Square(3, 0), new Square(4, 0), new Square(5, 0) );

	/** Sets up shape arrays for use in testing */
	protected void setUp() throws Exception {
		super.setUp();
		shapeFull = new Tile[12][12];
		for(int i=0; i< 12; i++){
			for(int j =0; j<12;j++){
				shapeFull[i][j]	= new Tile(i,j);
			}
		}
		
		shapeOddsEmpty = new Tile[12][12];
		for(int i=0; i< 12; i++){
			for(int j =0; j<12;j++){
				if (i%2 ==0){
					shapeOddsEmpty[i][j] = new Tile(i,j);
				} else {
					shapeOddsEmpty[i][j] = null;
				}
			}
		}
	
	}	
	
	public void testAvailableTile() {
		LightningBoard lB = new LightningBoard();
		assertFalse(lB.availableTile(-1, 0));
		assertFalse(lB.availableTile(0, -1));
		assertFalse(lB.availableTile(12, 0));
		assertFalse(lB.availableTile(0, 12));
		
		assertTrue(lB.availableTile(0, 0));
		assertTrue(lB.availableTile(11, 11));
		assertTrue(lB.availableTile(6, 6));
		
		LightningBoard lBOddsEmpty = new LightningBoard(shapeOddsEmpty);
		assertFalse(lBOddsEmpty.availableTile(-1, 0));
		assertFalse(lBOddsEmpty.availableTile(0, -1));
		assertFalse(lBOddsEmpty.availableTile(12, 0));
		assertFalse(lBOddsEmpty.availableTile(0, 12));
		assertFalse(lBOddsEmpty.availableTile(1, 0));
		assertFalse(lBOddsEmpty.availableTile(11, 11));
		
		assertTrue(lBOddsEmpty.availableTile(0, 0));
		assertTrue(lBOddsEmpty.availableTile(2, 0));
		assertTrue(lBOddsEmpty.availableTile(6, 6));
	}

	public void testPiecePlaceable() {
		fail("Not yet implemented"); // TODO
	}

	public void testAddPiece() {
		LightningBoard b = new LightningBoard();
		assertTrue(b.addPiece(0, 0, verticalBar));
		assertFalse(b.addPiece(0, 0, verticalBar));
		assertTrue(b.addPiece(6, 0, verticalBar));
		
		LightningBoard oddLightningBoard = new LightningBoard(shapeOddsEmpty);
		//vertical pieces should not be playable on this LightningBoard
		assertFalse(oddLightningBoard.addPiece(0, 0, verticalBar));
		assertFalse(oddLightningBoard.addPiece(1, 0, verticalBar));
		assertFalse(oddLightningBoard.addPiece(0, 1, verticalBar));
		
		//testing horizontal pieces
		assertTrue(oddLightningBoard.addPiece(0, 0, horizontalBar));
		//there is now a piece in the top corner
		assertFalse(oddLightningBoard.addPiece(0, 5, horizontalBar));
		assertTrue(oddLightningBoard.addPiece(0, 6, horizontalBar));
		//this row should not be playable
		assertFalse(oddLightningBoard.addPiece(1, 0, horizontalBar));
		//should overlap edge of LightningBoard
		assertFalse(oddLightningBoard.addPiece(2, 7, horizontalBar));
	}

	public void testRemovePiece() {
		fail("Not yet implemented"); // TODO
	}

	public void testMovePiece() {
		fail("Not yet implemented"); // TODO
	}

	public void testSpacesLeft() {
		fail("Not yet implemented"); // TODO
	}

}
