package entity.builder;

import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.PieceBuilder;

public class BuildableRelease  extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PieceBuilder PB = new PieceBuilder();
	
	public BuildableRelease(){
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
	public void setBoard(Board b){
		brd = b;
	}
	public void setType(String s){
		type = s;
	}
}
