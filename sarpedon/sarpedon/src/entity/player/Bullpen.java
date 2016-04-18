package entity.player;

import java.util.ArrayList;

public class Bullpen {
	ArrayList <Piece> pieces;
	Piece selectedPiece;
	
	Bullpen(ArrayList <Piece> pcs, Piece sPiece){
		pieces = pcs;
		selectedPiece = sPiece; 
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
	public Piece getSelectedPiece(){
		return selectedPiece;
	}
	
	Piece removePiece(Piece p){
		int i = pieces.indexOf(p);
		// checks for invalid index then removes piece, otherwise throws error
		if (i > -1){
			Piece ret = pieces.remove(i);
			return ret;
		}
		else {
			throw new RuntimeException ("Piece not found in Bullpen!");
		}
	}
	
	int piecesLeft(){
		return pieces.size();
	}
}
