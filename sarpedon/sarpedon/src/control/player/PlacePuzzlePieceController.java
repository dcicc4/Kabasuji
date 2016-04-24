package control.player;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JRadioButton;

import boundary.builder.BuilderBoardPanel;
import bounday.player.PlayerBoardPanel;
import entity.player.Board;
import entity.player.Level;
import entity.player.Piece;
import entity.player.PuzzleLevel;

/**
 * Places active piece on board or picks up a piece on the board.
 * Suitable for Puzzle Levels.
 * (Nearly identical to the builder version)
 * 
 * @author Nathan
 *
 */
public class PlacePuzzlePieceController implements MouseListener {
	
	PuzzleLevel model;
	PlayerBoardPanel boardView;
	
	public PlacePuzzlePieceController(PuzzleLevel l, PlayerBoardPanel bv){
		model = l;
		boardView = bv;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		return;
		
	}

	@Override
	/**
	 * when the mouse is left clicked, we want to place a piece if it is active or 
	 * pick up a piece if there is nothing active.
	 */
	public void mousePressed(MouseEvent e) {
		//only do this if you are left clicking (and the move piece button is selected)
		if(e.getButton() == MouseEvent.BUTTON1){
			Piece adding = model.getBullpen().getSelectedPiece();
			Board b = model.getBoard();
			Point clicked = boardView.getRowCol(e.getPoint());
			if(clicked == null){return;}
			if(adding == null){
				//this means you are trying to pick up a piece.
				Piece picked = b.getPiece(clicked.x,clicked.y);
				if(picked==null){return;}
				b.removePiece(clicked.x, clicked.y);
				model.getBullpen().setSelected(picked);
				boardView.redraw();
				boardView.repaint();
			} else {
				//you are trying to place a piece
				if(b.addPiece(clicked.x, clicked.y, adding)){
					model.getBullpen().removeSelected();
					boardView.redraw();
					boardView.repaint();
				}
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		return;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		return;
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		return;
		
	}

}
