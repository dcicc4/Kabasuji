package entity.player;

public class Square {
int xFromAnchor;
int yFromAnchor;
public Square(int xFromAnchor, int yFromAnchor){
	this.xFromAnchor=xFromAnchor;
	this.yFromAnchor= xFromAnchor;
}
int getX()
{
	return this.xFromAnchor;
}
int getY()
{
return this.yFromAnchor;
}


}