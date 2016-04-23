package control.builder;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import entity.builder.BuilderModel;
import entity.builder.IBuilderModel;
import entity.player.*;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;

public class MoveTilesController extends MouseAdapter{

	BuilderBoardPanel boardView;
	IBuilderModel model;
	JRadioButton moveTiles;
	Point origin;
	
	public MoveTilesController(IBuilderModel m, BuilderBoardPanel newboard, JRadioButton movingTiles){
		boardView = newboard;
		model = m;
		moveTiles = movingTiles;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(moveTiles.isSelected()){
			Board b = model.getBoard();
			Tile t = boardView.getTile(e.getPoint());
			if(t == null){return;}
			origin = new Point(t.getRow(), t.getColumn());
			b.removeTile(t.getRow(),t.getColumn());
			b.setMovingTile(true);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(moveTiles.isSelected() && model.getBoard().getMovingTile()){
			Point rowCol = boardView.getRowCol(e.getPoint());
			if(model.getBoard().getTile(rowCol.x, rowCol.y) == null){
			Tile t = new Tile(rowCol.x, rowCol.y);
			model.getBoard().setTile(t);
			} else {
				model.getBoard().setTile(new Tile(origin.x, origin.y));
			}
			model.getBoard().setMovingTile(false);
			boardView.setMouse(null);
			boardView.redraw();
			boardView.repaint();
		}
		
	}
	public void mouseDragged(MouseEvent e){
		boardView.setMouse(e.getPoint());
		boardView.redraw();
		boardView.repaint();
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