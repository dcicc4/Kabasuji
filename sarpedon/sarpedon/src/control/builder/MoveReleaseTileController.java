package control.builder;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;

import boundary.builder.BuilderBoardPanel;
import entity.builder.BuildableRelease;
import entity.builder.IBuilderModel;
import entity.player.Board;
import entity.player.ReleaseBoard;
import entity.player.ReleaseTile;
import entity.player.Tile;

public class MoveReleaseTileController extends MouseAdapter{

	BuilderBoardPanel boardView;
	BuildableRelease model;
	JRadioButton moveTiles;
	Point origin;
	
	public MoveReleaseTileController(BuildableRelease m, BuilderBoardPanel newboard, JRadioButton movingTiles){
		boardView = newboard;
		model = m;
		moveTiles = movingTiles;
	}
	
	@Override
	/**
	 * Select the tile to move at the clicked point.
	 * will not select the tile if it's covered by the piece.
	 */
	public void mousePressed(MouseEvent e) {
		if(moveTiles.isSelected()){
			ReleaseBoard b = model.getRBoard();
			Point p = boardView.getRowCol(e.getPoint());
			if(p == null){return;}
			ReleaseTile t = b.getTileArray()[p.x][p.y];
			if(t.getCoveredBy() != null){return;}
			origin = new Point(t.getRow(), t.getColumn());
			b.removeTile(t.getRow(),t.getColumn());
			b.setMovingTile(true);
			b.setMoving(t);
		}
		
	}
	
	@Override
	/**
	 * place the tile on the board somewhere.
	 * if it is not valid, it will put it back where it came from.
	 */
	public void mouseReleased(MouseEvent e) {
		if(moveTiles.isSelected() && model.getRBoard().getMovingTile()){
			Point rowCol = boardView.getRowCol(e.getPoint());
			ReleaseTile moving = model.getRBoard().getMoving();
			if(rowCol != null){
				ReleaseTile aT = model.getRBoard().getTileArray()[rowCol.x][rowCol.y];
				if(aT == null){
					//this is a valid place to put a tile
					
					ReleaseTile t = new ReleaseTile(rowCol.x, rowCol.y, moving.getNumber(), moving.getColor());
					model.getRBoard().setRTile(t);
				}
				else {
					//trying to place a tile on an already existing tile.
					//also if you are trying to place a piece outside the range of the board.
					model.getRBoard().setRTile(new ReleaseTile(origin.x, origin.y, moving.getNumber(), moving.getColor()));
				}
				
			}
			else {
				//trying to place a tile on an already existing tile.
				//also if you are trying to place a piece outside the range of the board.
				model.getRBoard().setRTile(new ReleaseTile(origin.x, origin.y, moving.getNumber(), moving.getColor()));
			}
			model.getBoard().setMovingTile(false);
			boardView.setMouse(null);
			boardView.redraw();
			boardView.repaint();
		}

	}
	
	/**
	 * Update the location of the tile.
	 */
	public void mouseDragged(MouseEvent e){
		boardView.setMouse(e.getPoint());
		boardView.redraw();
		boardView.repaint();
	}
}
