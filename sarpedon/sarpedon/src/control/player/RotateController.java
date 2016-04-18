package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounday.player.PlayerBullpenPanel;
import entity.player.Piece;

class RotateController implements ActionListener{

	PlayerBullpenPanel bullpenPanel;
	Piece piece;
	
	RotateController(PlayerBullpenPanel bullpenPanel, Piece piece) {
		this.bullpenPanel = bullpenPanel;
	}
	
	void rotate(boolean direction) {
		if (direction) {
			piece.rotateClockwise();
		} else {
			piece.rotateCounterClockwise();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
