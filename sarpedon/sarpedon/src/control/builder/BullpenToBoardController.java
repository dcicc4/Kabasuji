package control.builder;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class BullpenToBoardController implements MouseMotionListener{

	Board board;
	Bullpen bullpen;
	BuilderBoardPanel boardView;
	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public BullpenToBoardController(Board newboard, Bullpen newbullpen, BuilderBoardPanel newboardPanel, BuilderBullpenPanel newbullpenPanel){
		board = newboard;
		bullpen = newbullpen;
		boardView = newboardPanel;
		bullpenPanel = newbullpenPanel;
	}
	
	public void move(Piece piece, int col, int row){

	}

	public void mouseEntered(MouseEvent me) {
		boardView.setMouse(me.getPoint());
	}
	
	public void mouseMoved (MouseEvent me) {
		Piece selected = bullpen.getSelectedPiece();
		if (selected == null) { return; }
		Point p = new Point(me.getX() - boardView.getN()/2, me.getY() - boardView.getN()/2);
		boardView.setMouse(p);
		boardView.redraw();
		boardView.repaint();
		
	}
	
	public void mouseExited(MouseEvent me) {
		boardView.setMouse(null);
		boardView.redraw();
		boardView.repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}