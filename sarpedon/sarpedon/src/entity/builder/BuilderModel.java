package entity.builder;

import java.util.ArrayList;

import entity.player.*;

public class BuilderModel extends Level{

	Board board;
	Bullpen bullpen;
	Integer stars;
	boolean completed;
	ArrayList <Hint> hints;
	PieceBuilder pieceBuilder;
	
	public BuilderModel(){
		bullpen = new Bullpen();
		pieceBuilder = new PieceBuilder();
		board = new Board();
	}
	public Board getBoard(){
		return board;
	}
	public Bullpen getBullpen(){
		return bullpen;
	}
	public void setBullpen(Bullpen bp){
		this.bullpen = bp;
	}
	

}
