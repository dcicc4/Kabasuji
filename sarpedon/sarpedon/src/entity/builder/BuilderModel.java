package entity.builder;

import java.util.ArrayList;

import entity.player.*;

public class BuilderModel extends Level{

	Board brd;
	Bullpen bp;
	Integer stars;
	boolean completed;
	ArrayList <Hint> hints;
	PieceBuilder pb;

	
	public BuilderModel(){
		bp = new Bullpen();
		pb = new PieceBuilder();
	}
	
	public Bullpen getBullpen(){
		return bp;
	}
	public void setBullpen(Bullpen bp){
		this.bp = bp;
	}
	

}
