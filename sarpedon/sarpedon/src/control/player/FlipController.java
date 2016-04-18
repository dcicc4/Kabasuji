package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounday.player.PlayerBullpenPanel;
import entity.player.Piece;

class FlipController implements ActionListener {
	
	PlayerBullpenPanel bullpenPanel;
	Piece piece;
	
	FlipController(PlayerBullpenPanel bullpenPanel, Piece piece) {
		this.bullpenPanel = bullpenPanel;
		this.piece = piece;
	}
	
	void flip(boolean direction) {
		if (direction) {
			piece.flipHorizontal();
		} else {
			piece.flipVertical();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
