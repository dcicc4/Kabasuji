package entity.builder;

import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.LevelMomento;
import entity.player.PieceBuilder;
import entity.player.ReleaseBoard;

public class BuildableLightning extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PieceBuilder PB = new PieceBuilder();
Integer timeAllotted;
	
	public BuildableLightning(){
		super("Lightning");
		this.type = "Lightning";
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
	@Override
	public ReleaseBoard getRBoard() {
		// TODO Auto-generated method stub
		return null;
	}
}
