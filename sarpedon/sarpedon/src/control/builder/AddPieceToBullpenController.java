package control.builder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.builder.BuilderBullpenPanel;
import boundary.builder.BuilderStockPanel;
import entity.player.Bullpen;
import entity.player.Piece;

public class AddPieceToBullpenController extends MouseAdapter {

	BuilderStockPanel stock;
	BuilderBullpenPanel bullpenView;
	Bullpen bullpen;

	public AddPieceToBullpenController(Bullpen bp, BuilderStockPanel s, BuilderBullpenPanel bv){
		stock = s;
		bullpen = bp;
		bullpenView = bv;
	}
	
	public void mousePressed (MouseEvent me) {
		Piece p = stock.getPieceAtCoordinate(me.getPoint());
		if(p == null){
			return;
		}
		// if this is the selected piece, add it to the bullpen
		bullpen.addPiece(p);
		bullpenView.setPieces(bullpen);
		bullpenView.redraw();
		bullpenView.repaint();
	}
	
}
