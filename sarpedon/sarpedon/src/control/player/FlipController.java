package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounday.player.PlayerBoardPanel;
import entity.player.Level;
import entity.player.Piece;
/**
 * Handles the flipping of an active piece.
 * true -> Vertical Flipping 
 * false -> Horizontal Flipping
 * @author Nathan
 *
 */
class FlipController implements ActionListener{
	
	PlayerBoardPanel boardPanel;
	Level model;
	Boolean direction;
	
	public FlipController(PlayerBoardPanel newBoardPanel, Level l, Boolean newdirection){
		boardPanel = newBoardPanel;
		model = l;
		direction = newdirection;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Piece piece = model.getBullpen().getSelectedPiece();
		if (piece == null){return;}
		if (direction){
			piece.flipVertical();
		} else {
			piece.flipHorizontal();
		}
		model.getBullpen().setSelected(piece);
		boardPanel.redraw();
		boardPanel.repaint();
	}

}
