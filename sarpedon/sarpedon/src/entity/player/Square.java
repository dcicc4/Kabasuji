package entity.player;

import java.io.Serializable;

public class Square implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1967981073234849684L;
	/**
	 * 
	 */
	
	int xFromAnchor;
	int yFromAnchor;
	
	public Square(int xFromAnchor, int yFromAnchor){
		this.xFromAnchor = xFromAnchor;
		this.yFromAnchor = yFromAnchor;
	}
	
	public int getX(){
		return this.xFromAnchor;
	}
	public int getY(){
		return this.yFromAnchor;
	}
	public void setX(int x)	{
		xFromAnchor = x;
	}
	public void setY(int y){
		yFromAnchor = y;
	}
	
	
	void rotateClockwise(){
		int currentY = yFromAnchor; 
			yFromAnchor = -1*xFromAnchor;
			xFromAnchor =  currentY;
	}
	
	void rotateCounter(){
		int currentY = yFromAnchor;
			yFromAnchor =  xFromAnchor;
			xFromAnchor = -1* currentY;
	}

	void flipHorizontal(){
		xFromAnchor = -1*xFromAnchor;
	}
	
	void flipVertical(){
		yFromAnchor = -1*yFromAnchor;
	}
}