package entity.player;

import java.util.ArrayList;

public class Bullpen {
	ArrayList <Piece> pieces;
	Piece selectedPiece;
	
	Bullpen(ArrayList <Piece> pcs, Piece sPiece){
		pieces = pcs;
		selectedPiece = sPiece; // do we need this?
	}
	
	void addPiece(Piece p){
		pieces.add(p);
	}
	
	Piece removePiece(Piece p){
		int i = pieces.indexOf(p);
		Piece ret = pieces.remove(i);
		return ret;
		}
	
	int piecesLeft(){
		return pieces.size();
	}
}
