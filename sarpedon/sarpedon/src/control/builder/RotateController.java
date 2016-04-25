package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entity.builder.IBuilderModel;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;
/**
 * Rotates the active Piece.
 * true is a counter clockwise rotation, false is a clockwise rotation
 * @author Nathan
 *
 */
public class RotateController implements ActionListener{

	IBuilderModel model;
	BuilderBoardPanel boardPanel;
	boolean direction;
	
	public RotateController(BuilderBoardPanel newBoardPanel, IBuilderModel bm, Boolean newdirection){
		boardPanel = newBoardPanel;
		model = bm;
		direction = newdirection;
	}
	
	public void rotate(boolean direction){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Piece piece = model.getBullpen().getSelectedPiece();
		if (piece == null){return;}
		if (direction){
			piece.rotateCounterClockwise();;
		} else {
			piece.rotateClockwise();
		}
		model.getBullpen().setSelected(piece);
		boardPanel.redraw();
		boardPanel.repaint();
		
	}
}
