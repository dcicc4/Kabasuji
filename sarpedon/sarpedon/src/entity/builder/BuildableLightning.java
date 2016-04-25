package entity.builder;

import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.LevelMomento;
import entity.player.PieceBuilder;

public class BuildableLightning extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PieceBuilder PB = new PieceBuilder();
Integer timeAllotted;
	
	public BuildableLightning(){
		super("Lightning");
	}
	public Board getBoard(){
		return super.getBoard();
	}
	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public Integer getTimeAllotted(){
		return timeAllotted;
	}
	public void setTimeAllotted(Integer t){
		timeAllotted = t;
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
	
	public void restore(LevelMomento m){
		super.restore(m);
		timeAllotted = m.getTimeAllotted();
	}
}
