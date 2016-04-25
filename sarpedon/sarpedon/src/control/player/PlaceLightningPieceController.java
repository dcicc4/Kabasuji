package control.player;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.LightningLevelGui;
import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.LightningLevel;
import entity.player.Piece;

/**
 * Handles the placement of a lightning piece.
 * @author Nathan
 *
 */
public class PlaceLightningPieceController implements MouseListener{

	LightningLevelGui gui;
	LightningLevel level;
	PlayerBoardPanel boardView;
	PlayerBullpenPanel bullpenView;
	
	public PlaceLightningPieceController(LightningLevel l, LightningLevelGui g){
		level = l;
		boardView = g.getBoardView();
		bullpenView = g.getBullpenView();
		gui = g;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		return;
	}
	@Override
	/**
	 * If the mouse is clicked, we want to add the piece to the lightning board.
	 * Then we want to place the piece back in the bullpen.
	 * This is only possible if the timer has not reached zero.
	 */
	public void mousePressed(MouseEvent e) {
		if(level.getTimeLeft() > 0){
			Piece selected = level.getBullpen().getSelectedPiece();
			if(selected == null){return;}
			Point clicked = boardView.getRowCol(e.getPoint());
			if(clicked == null){return;}
			//copy the piece so that we can change its color to green but the original pieces color remains the same.
			Piece adding = selected.clone();
			adding.setColor(Color.green);
			if(level.getBoard().addPiece(clicked.x, clicked.y, adding)){
				level.getBullpen().addPiece(selected);
				level.getBullpen().removeSelected();
			}
			bullpenView.redraw();
			bullpenView.repaint();
			boardView.redraw();
			boardView.repaint();

		}
		level.updateStars();
		gui.setStarsView("Stars: " + level.getStars().toString());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		return;
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		return;
	}
	@Override
	public void mouseExited(MouseEvent e) {
		return;
	}
	
}
