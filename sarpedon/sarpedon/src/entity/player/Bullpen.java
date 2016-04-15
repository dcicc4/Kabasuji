package entity.player;

import java.util.ArrayList;

public class Bullpen {
	
	ArrayList <Piece> pieces;
	Piece selectedPiece;
	//stub
	
	public Bullpen(ArrayList <Piece> pcs){
		pieces = pcs;
		selectedPiece = null;
	}
	
	public Bullpen(){
		pieces = new ArrayList<Piece>(0);
		selectedPiece = null;
	}
	
	public void setSelected(Piece p ){
		selectedPiece = p;
	}
	public ArrayList<Piece> getPieces(){
		return pieces;
	}
	public void removeSelected(){
		selectedPiece = null;
	}
	
	public void addPiece(Piece p){
		pieces.add(p);
	}
}
