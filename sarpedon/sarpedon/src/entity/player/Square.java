package entity.player;

public class Square {
	
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
	void rotateClockwise()
	{
		int currentY = yFromAnchor;
		if(xFromAnchor > 0)
		{
			yFromAnchor = xFromAnchor;
		}
		else 
			yFromAnchor = -1*xFromAnchor;
		if(yFromAnchor >0)
		{
			xFromAnchor = -1* currentY;
		}
		else
			xFromAnchor =  currentY;
	}
	
	void rotateCounter()
	{
		int currentY = yFromAnchor;
		if(xFromAnchor > 0)
		{
			yFromAnchor = -1*xFromAnchor;
		}
		else 
			yFromAnchor =  xFromAnchor;
		if(yFromAnchor >0)
		{
			xFromAnchor =  currentY;
		}
		else
			xFromAnchor = -1* currentY;
	}

	void flipHorizontal()
	{
		xFromAnchor = -1*xFromAnchor;
	}
	void flipVertical()
	{
		yFromAnchor = -1*yFromAnchor;
	}
}