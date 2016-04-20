package control.builder;

import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
import entity.player.Bullpen;
import entity.player.Piece;

public class SelectPieceController extends MouseAdapter {

	Bullpen bullpen;
	BuilderBoardPanel boardView;
	BuilderBullpenPanel bullpenView;
	
	public SelectPieceController(Bullpen bp, BuilderBoardPanel boardv, BuilderBullpenPanel bullv){
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
			}
			return;
		}
		// if this is the selected piece, add it to the bullpen
		bullpen.setSelected(p);
		bullpen.removePiece(p);
		bullpenView.redraw();
		bullpenView.repaint();
	}
	
	
}
