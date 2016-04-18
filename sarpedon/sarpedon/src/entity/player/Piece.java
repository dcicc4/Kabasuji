package entity.player;

import java.awt.Color;

public class Piece {

	int number;
	int row;
	int column;
	Square[] dependent = new Square[6];
	Square anchor;
	boolean board;
	boolean bullpen;
	Color color;

	public Piece(int number, Square a, Square b, Square c, Square d, Square e)
	{
		this.number = number;
		Square[] sqs = {a,  b,  c, d, e, new Square (0,0)};
		this.board = false;
		this.bullpen = false;
		this.anchor = new Square (0,0);
		
		for (int x = 0; x< sqs.length ; x++)
		{
			this.dependent[x] = sqs[x];
		}
	}
	public Square[] getDependant(){
		return dependent;
	}
	
	public void setColor(Color c){
		color = c;
	}
	public Color getColor(){
		return color;
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

	public void rotateClockwise ()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].rotateClockwise();
		 
		}
	}

	public void rotateCounterClockwise ()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].rotateCounter();
		 
		}
	}

	public void flipHorizontal()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipHorizontal();
		 
		}
	}

	public void flipVertical()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipVertical();
		 
		}
	}

	public boolean fits(Tile[] aTile)
	{ int match = 0;
	for (int x = 0; x<  dependent.length; x++)
	{
		for(int y = 0; y < aTile.length; y++)
		{
			if (tileFit(aTile[y], dependent [x]))
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
