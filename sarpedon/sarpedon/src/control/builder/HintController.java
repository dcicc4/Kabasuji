package control.builder;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import entity.builder.BuildableRelease;
import entity.builder.IBuilderModel;
import entity.player.*;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;
/**
 * Allows the adding of hints
 * @author Drew
 * @author Nathan
 */
public class HintController extends MouseAdapter{

	IBuilderModel model;
	JRadioButton addHint;
	BuilderBoardPanel boardView;
	
	public HintController(IBuilderModel model, BuilderBoardPanel boardView, JRadioButton addHintRadio){
		this.model = model;
		this.boardView = boardView;
		this.addHint = addHintRadio;
	}
	

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (addHint.isSelected()){
			Piece adding = model.getBullpen().getSelectedPiece();
			Point clicked = boardView.getRowCol(e.getPoint());
			if(clicked == null){return;}
			if(adding == null){
				//you are trying to remove a hint
				Hint removing = null;
				for(Hint h: model.getHints()){
					if(h.covers(clicked.x, clicked.y)){
						removing = h;
					}
				}
				if(removing != null){
					model.getHints().remove(removing);
					boardView.redraw();
					boardView.repaint();
				}
			} else {
				//you are trying to place a hint
					model.getHints().add(new Hint(adding.clone(), clicked.x, clicked.y));
					boardView.redraw();
					boardView.repaint();
				
			}
		}
	}
}