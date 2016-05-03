package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import entity.player.*;
import entity.builder.*;
import entity.player.Piece;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;

public class UndoController implements ActionListener {

	IBuilderModel aLevel;
	BuilderBoardPanel boardView;
	BuilderBullpenPanel bpView;
	/**
	 * Constructor for UndoController
	 * @param aLevel - Current model
	 * @param boardView - Current board view
	 * @param bpView - Current bullpen view
	 */
	public UndoController(IBuilderModel aLevel, BuilderBoardPanel boardView, BuilderBullpenPanel bpView) {
		this.aLevel = aLevel;
		this.boardView = boardView;
		this.bpView = bpView;
	}
	/**
	 * Handles undoing the last move made
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (aLevel.getBullpen().getSelectedPiece() != null) {
			Piece tempP = aLevel.getBullpen().getSelectedPiece();
			aLevel.getBullpen().removeSelected();
			aLevel.getBullpen().addPiece(tempP);
		} 
			IMove aMove = aLevel.getLastMove();
			if (aMove == null) {
				return;
			}
			aMove.undo();
		
		boardView.redraw();
		boardView.repaint();
		bpView.redraw();
		bpView.repaint();

	}
}