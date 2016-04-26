package entity.player;

import java.io.Serializable;
/**
 * A combination of six of these makes a piece
 * @author Drew
 *
 */
public class Square implements Serializable {
	
	
	private static final long serialVersionUID = 1967981073234849684L;
	
	/**
	 * the piece's distance from the anchor piece
	 */
	int xFromAnchor;
	/**
	 * the piece's distance from the anchor piece
	 */
	int yFromAnchor;
	/**
	 * creates a square given an x and y coordinate
	 * @param xFromAnchor
	 * @param yFromAnchor
	 */
	public Square(int xFromAnchor, int yFromAnchor){
		this.xFromAnchor = xFromAnchor;
		this.yFromAnchor = yFromAnchor;
	}
	/**
	 * 
	 * @return the horizontal distance from the anchor
	 */
	public int getX(){
		return this.xFromAnchor;
	}
	/**
	 * 
	 * @return the vertical distance from the anchor
	 */
	public int getY(){
		return this.yFromAnchor;
	}
	/**
	 * 
	 * @param x sets the x distance from anchor
	 */
	public void setX(int x)	{
		xFromAnchor = x;
	}
	/**
	 * 
	 * @param y sets the y distance from the anchor
	 */
	public void setY(int y){
		yFromAnchor = y;
	}
	
	/**
	 * places a square where it should be if the piece is rotated clockwise
	 */
	void rotateClockwise(){
		int currentY = yFromAnchor; 
			yFromAnchor = -1*xFromAnchor;
			xFromAnchor =  currentY;
	}
	/**
	 * places a square where it should be if the piece is rotated counter clockwise
	 */
	void rotateCounter(){
		int currentY = yFromAnchor;
			yFromAnchor =  xFromAnchor;
			xFromAnchor = -1* currentY;
	}
	/**
	 * places a square where it should be if the piece is flipped horizontally
	 */
	void flipHorizontal(){
		xFromAnchor = -1*xFromAnchor;
	}
	/**
	 * places a square where it should be if the piece is flipped vertically
	 */
	void flipVertical(){
		yFromAnchor = -1*yFromAnchor;
	}
}