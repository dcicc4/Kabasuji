package entity.player;

import junit.framework.TestCase;
/**
 *  Tests for the entity.player.Board class
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class BoardTest extends TestCase {
	/** a 12 x 12 Tile array */
	Tile[][] shapeFull;
	/** a 12 x 12 Tile array with odd rows empty */
	Tile[][] shapeOddsEmpty;
	/** a 13 x 13 Tile array */
	Tile[][] bigShape;
	/** a 6 x 6 Tile array */
	Tile[][] mediumShape;
	/** a 0 x 0 Tile array */
	Tile[][] minShape;
	
	/** a piece for use in testing */
	Piece P1 = new Piece(1,  new Square(0, 1), new Square(0, 2), new Square(0, 3), new Square(0, 4), new Square(0, 5) );


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
					shapeOddsEmpty[i][j]	= new Tile(i,j);
				} else {
					shapeOddsEmpty[i][j] = null;
				}
			}
		}
		
		bigShape = new Tile[13][13];
		for(int i=0; i< 12; i++){
			for(int j =0; j<12;j++){
				shapeFull[i][j]	= new Tile(i,j);
			}
		}
		
		mediumShape = new Tile[6][6];
		for(int i=0; i< 6; i++){
			for(int j =0; j<6;j++){
				shapeFull[i][j]	= new Tile(i,j);
			}
		}
		minShape = new Tile[0][0];
	}
	/** tests the default Board constructor */
	public void testBoard() {
		// call the constructor with no arguments
		Board b = new Board();
		// check size of shape array
		assertTrue(b.shape.length == 12);
		assertTrue(b.shape[0].length == 12);
		// check hash is initialized empty
		assertTrue(b.pieces.isEmpty());
	}

	/** tests the general Board constructor */
	public void testBoardTileArrayArray() {
		//Using the default Tile array
		Board fullBoard = new Board(shapeFull);
		// check size of shape array
		assertTrue(fullBoard.shape.length == 12);
		assertTrue(fullBoard.shape[0].length == 12);
		// check hash is initialized empty
		assertTrue(fullBoard.pieces.isEmpty());
		
		//Using a tile array with nulls
		Board oddBoard = new Board(shapeOddsEmpty);
		// check size of shape array
		assertTrue(oddBoard.shape.length == 12);
		assertTrue(oddBoard.shape[0].length == 12);
		// check hash is initialized empty
		assertTrue(oddBoard.pieces.isEmpty());
		for(int i=0; i< 12; i++){
			for(int j =0; j<12;j++){
				if (i%2 !=0){
					assertTrue(oddBoard.shape[i][j] == null); // check odds are null
				} else {
					assertTrue(oddBoard.shape[i][j] instanceof Tile); // check evens are Tiles
				}
			}
		}
		
		//Using an intermediate size Tile array
		Board mediumBoard = new Board (mediumShape);
		// check size of shape array
		assertTrue(mediumBoard.shape.length == 6);
		assertTrue(mediumBoard.shape[0].length == 6);
		// check hash is initialized empty
		assertTrue(mediumBoard.pieces.isEmpty());
		
		//Testing that exceptions are thrown appropriately when Tile array is not within the specification
		Board bigBoard;
		Board minBoard;
		boolean thrown = false;
		// Too big
		try {
			bigBoard = new Board(bigShape);
		} catch (RuntimeException e) {
			thrown = true;
		}
		// Too small
		try {
			minBoard = new Board(minShape);
		} catch (RuntimeException e) {
			thrown = true;
		}
		  assertTrue(thrown);
	}
	
	public void testGetPiece() {
		fail("Not yet implemented");
	}

	public void testGetTileArray() {
		fail("Not yet implemented");
	}

	public void testAvailableTile() {
		fail("Not yet implemented");
	}

	public void testPiecePlaceable() {
		fail("Not yet implemented");
	}

	public void testAddPiece() { //in progress
		Board b = new Board();
		assertTrue(b.addPiece(0, 0, P1));
		assertFalse(b.addPiece(0, 0, P1));
	}

	public void testRemovePiece() {
		fail("Not yet implemented");
	}

	public void testMovePiece() {
		fail("Not yet implemented");
	}

	public void testRemoveAll() {
		fail("Not yet implemented");
	}

}
