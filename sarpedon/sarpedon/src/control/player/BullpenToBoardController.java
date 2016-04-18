package control.player;

import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Piece;

public class BullpenToBoardController {
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
	
}
