package entity.builder;

import java.util.ArrayList;

import control.builder.IMove;
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
	ArrayList<IMove> MoveList = new ArrayList<IMove>();
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
	/**
	 * returns the last move or null if it is empty
	 */
	public IMove getLastMove() {
		if (MoveList.isEmpty())
		{
			return null;
		}
		IMove aMove= MoveList.get(MoveList.size());
		MoveList.remove(MoveList.size());
		return aMove;
	}
	/**
	 * adds a move to the list of moves
	 * @param aMove
	 */
	public void addMove(IMove aMove)
	{
		MoveList.add(aMove);
	}
}
