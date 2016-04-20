package entity.builder;

import java.util.ArrayList;

import entity.player.*;

public class BuilderModel extends Level{

PieceBuilder PB = new PieceBuilder();
	
	public BuilderModel(){
		super();
		bp = new Bullpen();
		PB = new PieceBuilder();
		brd = new Board();
	}
	public Board getBoard(){
		return brd;
	}
	public entity.player.Bullpen getBullpen(){
		return bp;
	}
	public void setBullpen(Bullpen bp){
		this.bp = bp;
	}
	public void setType(String s){
		type = s;
	}

}
