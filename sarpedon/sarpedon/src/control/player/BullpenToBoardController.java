package control.player;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

public class BullpenToBoardController implements MouseListener{
	Board board;
	Bullpen bullpen;
	Piece piece;
	PlayerBullpenPanel bullpenPanel;
	PlayerBoardPanel boardPanel;

	BullpenToBoardController(Board board, Bullpen bullpen, PlayerBullpenPanel bullpenPanel, PlayerBoardPanel boardPanel) {
		this.board = board;
		this.bullpen = bullpen;
		this.bullpenPanel = bullpenPanel;
		this.boardPanel = boardPanel;
	}
	
	void move(Piece piece, int col, int row) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
