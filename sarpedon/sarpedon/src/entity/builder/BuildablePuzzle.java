package entity.builder;

import entity.player.*;

public class BuildablePuzzle extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PieceBuilder PB = new PieceBuilder();
	
	public BuildablePuzzle(){
		super("Puzzle");
	}
	public Board getBoard(){
		return super.getBoard();
	}
	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public void setBullpen(Bullpen bp){
		bullpen = bp;
	}
	public void setBoard(Board b){
		board = b;
	}
	public void setType(String s){
		type = s;
	}
}
