package entity.player;

import junit.framework.TestCase;
/**
 * Tests for the Square class
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class SquareTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSquare() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor==0);
		assertTrue(sq1.yFromAnchor==0);
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
	}

	public void testGetX() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == sq1.getX());
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == sq2.getX());
	}

	public void testGetY() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.yFromAnchor== sq1.getY());
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.yFromAnchor == sq2.getY());
	}

	public void testSetX() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == 0);
		
		sq1.setX(5);
		assertTrue(sq1.xFromAnchor==5);
		
		sq1.setX(0);
		assertTrue(sq1.xFromAnchor ==0);
	}

	public void testSetY() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.yFromAnchor == 0);
		
		sq1.setY(7);
		assertTrue(sq1.yFromAnchor==7);
		
		sq1.setY(0);
		assertTrue(sq1.yFromAnchor ==0);
	}

	public void testRotateClockwise() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		sq1.rotateClockwise();
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.rotateClockwise();
		assertTrue(sq2.xFromAnchor == 9);
		assertTrue(sq2.yFromAnchor == -7);
		sq2.rotateClockwise();
		assertTrue(sq2.xFromAnchor == -7);
		assertTrue(sq2.yFromAnchor == -9);
		sq2.rotateClockwise();
		assertTrue(sq2.xFromAnchor == -9);
		assertTrue(sq2.yFromAnchor == 7);
		sq2.rotateClockwise();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
	}

	public void testRotateCounter() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		sq1.rotateClockwise();
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.rotateCounter();
		assertTrue(sq2.xFromAnchor == -9);
		assertTrue(sq2.yFromAnchor == 7);
		sq2.rotateCounter();
		assertTrue(sq2.xFromAnchor == -7);
		assertTrue(sq2.yFromAnchor == -9);
		sq2.rotateCounter();
		assertTrue(sq2.xFromAnchor == 9);
		assertTrue(sq2.yFromAnchor == -7);
		sq2.rotateCounter();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
	}

	public void testFlipHorizontal() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		sq1.flipHorizontal();
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipHorizontal();
		assertTrue(sq2.xFromAnchor == -7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipHorizontal();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipHorizontal();
		assertTrue(sq2.xFromAnchor == -7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipHorizontal();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
	}

	public void testFlipVertical() {
		Square sq1 = new Square(0,0);
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		sq1.flipVertical();
		assertTrue(sq1.xFromAnchor == 0);
		assertTrue(sq1.yFromAnchor == 0);
		
		Square sq2 = new Square(7,9);
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipVertical();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == -9);
		sq2.flipVertical();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
		sq2.flipVertical();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == -9);
		sq2.flipVertical();
		assertTrue(sq2.xFromAnchor == 7);
		assertTrue(sq2.yFromAnchor == 9);
	}

}
