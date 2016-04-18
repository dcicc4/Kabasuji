package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class FlipController implements ActionListener{

	BuilderBoardPanel boardPanel;
	Level level;
	Boolean direction;
	
	public FlipController(BuilderBoardPanel newBoardPanel, Level newLevel, Boolean newdirection){
		boardPanel = newBoardPanel;
		level = newLevel;
		direction = newdirection;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Piece piece = level.getBullpen().getSelectedPiece();
		if (piece == null){return;}
		if (direction){
			piece.flipVertical();
		} else {
			piece.flipHorizontal();
		}
		level.getBullpen().setSelected(piece);
		boardPanel.redraw();
		boardPanel.repaint();
	}
}