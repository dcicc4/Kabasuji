package entity.builder;

import entity.player.*;

public class BuilderModel {

	Bullpen bullpen;
	PieceBuilder pieceBuilder;
	
	public BuilderModel(){
		bullpen = new Bullpen();
		pieceBuilder = new PieceBuilder();
	}
	
	public Bullpen getBullpen(){
		return bullpen;
	}
	public void setBullpen(Bullpen bp){
		bullpen = bp;
	}
}
