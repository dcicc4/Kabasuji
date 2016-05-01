package control.builder;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Moves.ToStockMove;
import entity.builder.IBuilderModel;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class BackToStockController implements MouseListener{

	Bullpen bullpen;
	BuilderStockPanel stockPanel;
	BuilderBoardPanel boardView;
	IBuilderModel aModel;
	public BackToStockController(Bullpen bp, BuilderStockPanel bs, BuilderBoardPanel bbp, IBuilderModel aModel){
		bullpen = bp;
		stockPanel = bs;
		boardView = bbp;
		this.aModel =aModel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		return;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Piece removing = bullpen.getSelectedPiece();
		if(removing == null){return;}
		if(stockPanel.getPieceAtCoordinate(e.getPoint()) != null){return;}
		IMove aMove = new ToStockMove (bullpen, removing);
		aModel.addMove(aMove);
		bullpen.removeSelected();
		
		boardView.redraw();
		boardView.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
