package entity.player;


public class Piece {
int number;
int row;
int column;
Square[] dependant = new Square[5];
Square anchor;
boolean board;
boolean bullpen;
public Piece(int number, Square[] dependent)
{
	this.number = number;
	this.dependant = dependent;
	this.board = false;
	this.bullpen = false;
	this.anchor = new Square (0,0);
	this.dependant[5] = new Square (0,0);
}
void onBoard()
{
	board = true;
}

void offBoard()
{
	board = false;
}

void inBullpen()
{
	bullpen = true;
}
void outBullpen()
{
	bullpen = false;
}

void rotateHorizontal ()
{
	//put code here
}

void rotateVertical ()
{
	
}

void flipHorizontal()
{
	
}

void flipVertical()
{
	
}

boolean fits(Tile[5] aTile)
{ int match = 0;
	for (int x = 0; x<  dependant.length; x++)
	{
		for(int y = 0; y < aTile.length; y++)
		{
			if (tileFit(aTile[y], dependant [x]))
				{match ++;
				y = aTile.length;
				}
		}
			
}
	if (match = 6)
	{return true;}
}
	
	boolean tileFit(Tile aTile, Square aSquare)
	{
		if (Tile.getColumn() == aSquare.getX()+column && Tile.getRow() == aSquare.getY() + row)
		return true;
		return false;
	}
}




}
