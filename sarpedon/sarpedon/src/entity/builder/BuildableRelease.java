package entity.builder;

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

PieceBuilder PB = new PieceBuilder();
	ReleaseBoard rBoard;


		public BuildableRelease(){
		super("Release");
		this.type = "Release";

	
		}
	public Board getBoard(){
		return rBoard;
	}

	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public void setBullpen(Bullpen bp){
		bullpen = bp;
	}

	public void setBoard(Board b){
		rBoard = (ReleaseBoard) b;


	}
	public void setType(String s){
		type = s;
	}

		
	
	@Override
	public ReleaseBoard getRBoard() {
		return rBoard;
	}
}
