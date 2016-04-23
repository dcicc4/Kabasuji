package entity.player;

import java.awt.Color;
import java.io.Serializable;

public class Piece implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6485170791118171377L;
	int number;
	int row;
	int column;
	Square[] dependent = new Square[6];
	//Square anchor;
	boolean board;
	boolean bullpen;
	Color color;

	public Piece(int number, Square a, Square b, Square c, Square d, Square e)
	{
		this.number = number;
		Square[] sqs = {a,  b,  c, d, e, new Square (0,0)};
		this.board = false;
		this.bullpen = false;
		//this.anchor = new Square (0,0);
		
		for (int x = 0; x< sqs.length ; x++)
		{
			this.dependent[x] = sqs[x];
		}
	}
	public Piece(Square[] dep, int num ,Color c){
		dependent = dep;
		number = num;
		color = c;
	}
	
	/**
	 * Clones piece so two of the same pieces aren't the same object.
	 */
	public Piece clone(){
		Square[] dep = new Square[6];
		for(int i =0; i<6 ;i++){
			dep[i] = new Square(dependent[i].getX(), dependent[i].getY());
		}
		return new Piece(dep, this.number, this.color);
	}
//	/**
//	 * shifts all squares to right.
//	 * 
//	 * @param i - how far to shift
//	 */
//	public void shiftRight(int i){
//		for(int j=0; j<6; j++){
//			int shift = dependent[j].getX() + i;
//			dependent[j].setX(shift);
//		}
//	}
	/**
	 * shifts all squares down.
	 * 
	 * @param i - how far to shift
	 */
	public void shiftDown(int i){
		for(int j=0;j<6;j++){
			dependent[j].setY(dependent[j].getY()-i);
		}
	}
	/**
	 * centers piece for drawing.
	 */
	public void centerPiece(){
		int minY = 0;
		int minX = 0;
		int maxX = 0;
		for(int i = 0; i<6; i++){
			int x = dependent[i].getX();
			int y = dependent[i].getY();
			if(x > maxX){maxX = x;}
			if(x < minX){minX = x;}
			if(y < minY){minY = y;}
		}
		if(minY < 0){
			shiftDown(minY);
		}
	shiftRight(-(maxX+minX)/2);
	}
	
	private void shiftRight(int i) {
		for(int j=0;j<6;j++){
			dependent[j].setX(dependent[j].getX()+i);
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
		centerPiece();
	}

	public void rotateCounterClockwise ()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].rotateCounter();
		 
		}
		centerPiece();
	}

	public void flipHorizontal()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipHorizontal();
		}
		centerPiece();
	}

	public void flipVertical()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipVertical();
		 
		}
		centerPiece();
	}

	boolean fits(Tile[] aTile)
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
