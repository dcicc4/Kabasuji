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


}