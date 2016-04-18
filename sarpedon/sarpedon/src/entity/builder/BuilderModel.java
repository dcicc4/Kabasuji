package entity.builder;

import entity.player.*;

public class BuilderModel {

	Bullpen bullpen;
	Board board;
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
		bullpen = bp;
	}
}
