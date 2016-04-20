package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.PlayerBullpenPanel;
import entity.player.Piece;

class FlipController implements ActionListener, MouseListener{
	
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
