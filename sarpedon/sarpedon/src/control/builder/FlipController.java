package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entity.builder.IBuilderModel;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;
/**
 * Flips the active piece.
 * true is vertical false is horizontal.
 * 
 * @author Nathan
 *
 */
public class FlipController implements ActionListener{

	BuilderBoardPanel boardPanel;
	IBuilderModel model;
	Boolean direction;
	
	public FlipController(BuilderBoardPanel newBoardPanel, IBuilderModel bm, Boolean newdirection){
		boardPanel = newBoardPanel;
		model = bm;
		direction = newdirection;
	}

	@Override
	/**
	 * flips active piece in the specified direction.
	 * Note: piece may come from board unlike playable levels.
	 */
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