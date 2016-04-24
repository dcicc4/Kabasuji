package control.player;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

/**
 * Moves the bullpen's active piece around in the board panel.
 * Suitable for all Level types.
 * 
 * @author Nathan
 *
 */
public class BullpenToBoardController implements MouseMotionListener{
	
	Board board;
	Bullpen bullpen;
	PlayerBoardPanel boardView;
	PlayerBullpenPanel bullpenPanel;
	
	public BullpenToBoardController(Board newboard, Bullpen newbullpen, PlayerBoardPanel newboardPanel, PlayerBullpenPanel newbullpenPanel){
		board = newboard;
		bullpen = newbullpen;
		boardView = newboardPanel;
		bullpenPanel = newbullpenPanel;
	}
	
	public void move(Piece piece, int col, int row){

	}

	public void mouseEntered(MouseEvent me) {
		boardView.setMouse(me.getPoint());
	}
	
	public void mouseMoved (MouseEvent me) {
		Piece selected = bullpen.getSelectedPiece();
		if (selected == null) { return; }
		Point p = new Point(me.getX() - boardView.getN()/2, me.getY() - boardView.getN()/2);
		boardView.setMouse(p);
		boardView.redraw();
		boardView.repaint();
		
	}
	
	public void mouseExited(MouseEvent me) {
		boardView.setMouse(null);
		boardView.redraw();
		boardView.repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
