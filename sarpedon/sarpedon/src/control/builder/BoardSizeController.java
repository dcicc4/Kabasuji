package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import entity.builder.BuilderModel;
import entity.builder.IBuilderModel;
import entity.player.*;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
/**
 * This class is responsible for changing the board size.
 * Note that if the board is already configured, the pieces will be removed and a new board
 * will be made with the given number of squares.
 * 
 * @author Nathan
 *
 */
public class BoardSizeController implements ActionListener, ItemListener{

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
	public void actionPerformed(ActionEvent e) {
		System.out.println("size changed");
		int size = boardSize.getItemAt(boardSize.getSelectedIndex())*6;
		//handle the case where there are pieces on the board(later)
		Tile[][] boardShape = new Tile[12][12];
		int added = 0;
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				if(added <= size){
					boardShape[i][j] = new Tile(i, j);
					added++;
				}
			}
		}
		
		model.setBoard(new Board(boardShape));
		boardView.redraw();
		boardView.repaint();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("item changed");
		
	}
}