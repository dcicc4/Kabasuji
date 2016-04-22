package control.builder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import boundary.builder.BuilderBoardPanel;
import entity.builder.BuilderModel;
import entity.player.Board;
import entity.player.Piece;
import entity.player.Tile;
/**
 * Places selected piece on the board.
 * Will also pick up a piece if there is no selected piece.
 * @author Nathan
 *
 */
public class PlacePieceController implements MouseListener{
	
	BuilderModel model;
	BuilderBoardPanel boardView;
	
	public PlacePieceController(BuilderModel bm, BuilderBoardPanel bv){
		model = bm;
		boardView = bv;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		return;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse clicke");
		//only do this if you are left clicking
		if(e.getButton() == MouseEvent.BUTTON1){
			Piece adding = model.getBullpen().getSelectedPiece();
			Board b = model.getBoard();
			Tile clicked = boardView.getTile(e.getPoint());
			if(adding == null){
				//this means you are trying to pick up a piece.
				Piece picked = b.getPiece(clicked.getRow(),clicked.getColumn());
				if(picked==null){return;}
				b.removePiece(clicked.getRow(), clicked.getColumn());
				model.getBullpen().setSelected(picked);
				boardView.redraw();
				boardView.repaint();
			} else {
				//you are trying to place a piece
				if(b.addPiece(clicked.getRow(), clicked.getColumn(), adding)){
					System.out.println("pieceadded");
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
