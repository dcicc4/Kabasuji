package entity.player;

import java.awt.Color;
import java.io.Serializable;

/**
 * A piece that represents the basic six square KabaSuji piece
 * @author Drew
 *
 */
public class Piece implements Serializable{

	
	private static final long serialVersionUID = -6485170791118171377L;
	/**
	 * the number a piece is (it's key for the stock hashtable)
	 */
	int number;
	/**
	 * The row of the anchor if the piece is on the board
	 */
	int row;
	/**
	 * the column number of the anchor if the piece is on the board
	 */
	int column;
	/** An array of all the squares that make up a piece
	 * 
	 */
	Square[] dependent = new Square[6];
	/**
	 * tells if the pieces is on the board
	 */
	boolean board;
	/**
	 * tells if the piece is in the bullpen
	 */
	boolean bullpen;
	/**
	 * Color of the piece so that it is consistent
	 */
	Color color;

	/**
	 * 
	 * Constructor for taking in many squares to make a piece
	 */
	public Piece(int number, Square a, Square b, Square c, Square d, Square e)
	{
		this.number = number;
		Square[] sqs = {a,  b,  c, d, e, new Square (0,0)};
		this.board = false;
		this.bullpen = false;
		
		
		for (int x = 0; x< sqs.length ; x++)
		{
			this.dependent[x] = sqs[x];
		}
	}
	/**
	 * constructor for taking in an array of squares
	 * @param dep
	 * @param num
	 * @param c
	 */
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
	/**
	 * 
	 * @return the squares in the piece
	 */
	public Square[] getDependant(){
		return dependent;
	}
	/**
	 * 
	 * @param color to set the piece too
	 */
	public void setColor(Color c){
		color = c;
	}
	/**
	 * 
	 * @return the color of the piece
	 */
	public Color getColor(){
		return color;
	}
	/**
	 * returns true if the piece was on the board.
	 * returns false if the piece was not on the board.
	 * @return
	 */
	public boolean getBoardStatus(){
		return board;
	}
	/**
	 * sets the piece to be on a Board
	 */
	public void onBoard()
	{
		board = true;
	}
/**
 * sets piece to be off the board
 */
	public void offBoard()
	{
		board = false;
	}
/**
 * sets the piece to be in bullpen
 */
	void inBullpen()
	{
		bullpen = true;
	}
	/**
	 * sets piece to not be in bullpen
	 */
	void outBullpen()
	{
		bullpen = false;
	}
/**
 * rotates a piece clockwise and centers it
 */
	public void rotateClockwise ()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].rotateClockwise();
		 
		}
		centerPiece();
	}
/**
 * rotates a piece counter clockwise and centers it
 */
	public void rotateCounterClockwise ()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].rotateCounter();
		 
		}
		centerPiece();
	}
/**
 * flips a piece horizontally and centers it
 */
	public void flipHorizontal()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipHorizontal();
		}
		centerPiece();
	}
/**
 * flips a piece vertically and centers it
 */
	public void flipVertical()
	{
		for(int x = 0; x< dependent.length; x++)
		{
			dependent[x].flipVertical();
		 
		}
		centerPiece();
	}
/**
 * checks if a piece fits into a combination of a tile
 * @param aTile
 * @return
 */
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
