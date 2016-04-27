package entity.builder;

import java.util.ArrayList;

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
	BuildableReleaseBoard rBoard;


	public BuildableRelease(){
		super("Release");
		board = new BuildableReleaseBoard();
		bullpen = new Bullpen();
		stars = 0;
		
		type = "Release";
		number = null;
		
		
	
		}
	public Board getBoard(){
		return board;
	}

	public Bullpen getBullpen(){
		return super.getBullpen();
	}
	public void setBullpen(Bullpen bp){
		bullpen = bp;
	}

	public void setBoard(Board b){
		board = (BuildableReleaseBoard) b;


	}
	public void setType(String s){
		type = s;
	}

		
	
	
}
