package entity.builder;

import java.util.ArrayList;

import control.builder.IMove;
import entity.player.*;

public class BuildablePuzzle extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<IMove> MoveList = new ArrayList<IMove>();
PieceBuilder PB = new PieceBuilder();
Integer movesAllotted;	

	public BuildablePuzzle(){
		super("Puzzle");
		this.type = "Puzzle";
	}
	public Board getBoard(){
		return super.getBoard();
	}
	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public Integer getMovesAllotted(){
		return movesAllotted;
	}
	public void setMovesAllotted(Integer m){
		movesAllotted = m;
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
	@Override
	public void restore(LevelMomento m){
		super.restore(m);
		movesAllotted = m.getMovesAllotted();
	}
	/**
	 *returns the last move or null if empty
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
