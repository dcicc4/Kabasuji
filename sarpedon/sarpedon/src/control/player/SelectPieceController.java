package control.player;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.Bullpen;
import entity.player.Piece;

/**
 * selects a Piece from the bullpen and adds it to the board panel for moving.
 * 
 * @author Nathan
 *
 */
public class SelectPieceController extends MouseAdapter {
	Bullpen bullpen;
	PlayerBoardPanel boardView;
	PlayerBullpenPanel bullpenView;
	
	public SelectPieceController(Bullpen bp, PlayerBoardPanel boardv, PlayerBullpenPanel bullv){
		bullpen = bp;
		boardView = boardv;
		bullpenView = bullv;
	}

	public void mousePressed (MouseEvent me) {
			Piece p = bullpenView.getPieceAtCoordinate(me.getPoint());
			if(p == null){
				Piece selected = bullpen.getSelectedPiece();
				if(selected != null){
					bullpen.addPiece(selected);
					bullpen.removeSelected();
					bullpenView.redraw();
					bullpenView.repaint();
					boardView.redraw();
					boardView.repaint();
				}
				return;
			}
			// if this is the selected piece, add it to the bullpen
			if(bullpen.getSelectedPiece() != null){
				bullpen.addPiece(bullpen.getSelectedPiece());
			}
			bullpen.setSelected(p);
			bullpen.removePiece(p);
			bullpenView.redraw();
			bullpenView.repaint();
			boardView.redraw();
			boardView.repaint();
		
	}
}
