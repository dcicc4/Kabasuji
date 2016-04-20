package control.player;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

public class BoardToBullpenController implements MouseListener {

	Board board;
	Bullpen bullpen;
	Piece piece;
	PlayerBoardPanel boardPanel;
	PlayerBullpenPanel bullpenPanel;
	
	BoardToBullpenController(Board board, Bullpen bullpen, PlayerBoardPanel boardPanel, PlayerBullpenPanel bullpenPanel) {
		this.board = board;
		this.bullpen = bullpen;
		this.boardPanel = boardPanel;
		this.bullpenPanel = bullpenPanel;
	}
	
	void move(Piece piece, int col, int row) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
