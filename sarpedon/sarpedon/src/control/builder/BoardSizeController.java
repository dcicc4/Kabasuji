package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import entity.builder.IBuilderModel;
import entity.player.*;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
/**
 * This class is responsible for changing the board size.
 * Note that the board adds and subtracts pieces based on current and desired sizes.
 * will not subtract pieces that are covered by a piece.
 * 
 * @author Nathan
 *
 */
public class BoardSizeController implements ActionListener{

	BuilderBoardPanel boardView;
	JComboBox<Integer> boardSize;
	BuilderBullpenPanel bullpenView;
	IBuilderModel model;
	
	public BoardSizeController(JComboBox<Integer> size, BuilderBoardPanel bv, BuilderBullpenPanel bpv, IBuilderModel bm){
		boardView = bv;
		boardSize = size;
		bullpenView = bpv;
		model = bm;
	}

	@Override
	/**
	 * add or subtract tiles to make the correct size.
	 */
	public void actionPerformed(ActionEvent e) {
		int size = boardSize.getItemAt(boardSize.getSelectedIndex())*6;

		//get the current tile array of the board
		Tile[][] boardShape = model.getBoard().getTileArray();
		int currsize = model.getBoard().getSize();
		if(currsize < size){//when size requested is larger
			for(int i = 0; i<12; i++){
				for(int j = 0; j<12; j++){
					if(currsize < size && boardShape[i][j] == null){
						boardShape[i][j] = new Tile(i, j);
						currsize++;
					}
				}
			}
		}
		if(currsize > size){
			for(int i = 0; i<12; i++){
				for(int j = 0; j<12; j++){
					Tile t = boardShape[11-i][11-j];
					if(t != null){
					if(currsize > size && t.getCoveredBy() == null){
						boardShape[11-i][11-j] = null;
						currsize--;
					}
					}
				}
			}
		}
		
		bullpenView.redraw();
		bullpenView.repaint();
		boardView.redraw();
		boardView.repaint();
	}
}