package entity.builder;

import java.util.ArrayList;

import control.builder.IMove;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.PieceBuilder;
import entity.player.ReleaseBoard;

public class BuildableRelease  extends Level implements IBuilderModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ArrayList<IMove> MoveList = new ArrayList<IMove>();

PieceBuilder PB = new PieceBuilder();
	BuildableReleaseBoard rBoard;

	/**
	 * BuildableRelease constructor
	 */
	public BuildableRelease(){
		super("Release");
		board = new BuildableReleaseBoard();
		bullpen = new Bullpen();
		stars = 0;
		
		type = "Release";
		number = null;
		
		
	
		}
	/**
	 * Gets the board
	 */
	public Board getBoard(){
		return board;
	}
	/**
	 * Gets the bullpen
	 */
	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	/**
	 * sets the bullpen
	 */
	public void setBullpen(Bullpen bp){
		bullpen = bp;
	}
	/**
	 * sets the board
	 */
	public void setBoard(Board b){
		board = (BuildableReleaseBoard) b;


	}
	/**
	 * sets the type
	 */
	public void setType(String s){
		type = s;
	}
/**
 * returns the last move or null if there is no last move
 */
	public IMove getLastMove() {
		if (MoveList.isEmpty())
		{
			return null;
		}
		IMove aMove= MoveList.get(MoveList.size()-1);
		MoveList.remove(MoveList.size()-1);
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
