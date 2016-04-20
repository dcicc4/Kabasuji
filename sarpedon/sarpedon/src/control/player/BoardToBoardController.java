package control.player;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.PlayerBoardPanel;
import entity.player.Board;
import entity.player.Piece;

public class BoardToBoardController implements MouseListener {
	
	Piece piece;
	Board board;
	PlayerBoardPanel boardPanel;
	
	BoardToBoardController(Board board, PlayerBoardPanel boardPanel) {
		this.board = board;
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
