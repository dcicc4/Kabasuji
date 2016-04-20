package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entity.builder.BuilderModel;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class FlipController implements ActionListener{

	BuilderBoardPanel boardPanel;
	BuilderModel model;
	Boolean direction;
	
	public FlipController(BuilderBoardPanel newBoardPanel, BuilderModel bm, Boolean newdirection){
		boardPanel = newBoardPanel;
		model = bm;
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