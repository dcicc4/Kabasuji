package entity.builder;

import java.util.ArrayList;

import entity.player.*;

public interface IBuilderModel{

PieceBuilder PB = new PieceBuilder();
	

	public Board getBoard();
	public entity.player.Bullpen getBullpen();
	public void setBullpen(Bullpen bp);
	public void setBoard(Board b);
	public void setType(String s);
}
