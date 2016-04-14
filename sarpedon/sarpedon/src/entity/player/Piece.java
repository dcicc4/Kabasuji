package entity.player;


public class Piece {

	int number;
	int row;
	int column;
	Square[] dependant;
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
	}
	public Square[] getDependant(){
		return dependant;
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

	boolean fits(Tile[] aTile)
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
	if (match == 6)
	{return true;}
	else{return false;}
	}

	boolean tileFit(Tile aTile, Square aSquare)
	{
		if (aTile.getColumn() == aSquare.getX()+column && aTile.getRow() == aSquare.getY() + row)
			return true;
		return false;
	}
}

