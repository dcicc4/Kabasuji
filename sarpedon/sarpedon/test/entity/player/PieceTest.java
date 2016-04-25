package entity.player;

import junit.framework.TestCase;
import java.awt.Color;

public class PieceTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}


//	public void testPieceSquareArrayIntColor() {
//		Square s1 = new Square(0,1);
//		Square s2 = new Square(0,2);
//		Square s3 = new Square(0,3);
//		Square s4 = new Square(0,4);
//		Square s5 = new Square(0,0);
//		Square[] sqrs = {s1, s2, s3, s4, s5};
//		Piece testPiece = new Piece(sqrs, 5, new Color(0,0,255));
//		
//		assertTrue(testPiece.number == 5);
//		assertTrue(testPiece.)
//	}
	public void testClone() {
		Piece P3 = new Piece(3,  new Square(0, 1), new Square(0, 2), new Square(0, 3), new Square(0, 4), new Square(-1, 3) );
		Piece P3Clone = P3.clone();
		for(int i= 0; i<=5; i++){
			assertTrue(P3.dependent[i].xFromAnchor == P3Clone.dependent[i].xFromAnchor);
			assertTrue(P3.dependent[i].yFromAnchor == P3Clone.dependent[i].yFromAnchor);
		}
		assertFalse(P3 == P3Clone);
	}

	public void testShiftDown() {
		fail("Not yet implemented"); // TODO
	}

	public void testCenterPiece() {
		fail("Not yet implemented"); // TODO
	}

	public void testGetDependant() {
		Piece P3 = new Piece(3,  new Square(0, 1), new Square(0, 2), new Square(0, 3), new Square(0, 4), new Square(-1, 3) );
		assertTrue(P3.dependent == P3.getDependant());
	}

	public void testSetColor() {
		fail("Not yet implemented"); // TODO
	}

	public void testGetColor() {
		fail("Not yet implemented"); // TODO
	}

	public void testGetBoardStatus() {
		fail("Not yet implemented"); // TODO
	}

	public void testOnBoard() {
		fail("Not yet implemented"); // TODO
	}

	public void testOffBoard() {
		fail("Not yet implemented"); // TODO
	}

	public void testInBullpen() {
		fail("Not yet implemented"); // TODO
	}

	public void testOutBullpen() {
		fail("Not yet implemented"); // TODO
	}

	public void testRotateClockwise() {
		fail("Not yet implemented"); // TODO
	}

	public void testRotateCounterClockwise() {
		fail("Not yet implemented"); // TODO
	}

	public void testFlipHorizontal() {
		fail("Not yet implemented"); // TODO
	}

	public void testFlipVertical() {
		fail("Not yet implemented"); // TODO
	}

	public void testFits() {
		fail("Not yet implemented"); // TODO
	}

	public void testTileFit() {
		fail("Not yet implemented"); // TODO
	}

}
