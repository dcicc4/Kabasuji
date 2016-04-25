package entity.builder;

import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.PieceBuilder;

public class BuildableLightning extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PieceBuilder PB = new PieceBuilder();
Integer timeAlotted;
	
	public BuildableLightning(){
		super("Lightning");
	}
	public Board getBoard(){
		return super.getBoard();
	}
	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public Integer getTimeAlotted(){
		return timeAlotted;
	}
	public void setTimeAlotted(Integer t){
		timeAlotted = t;
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
