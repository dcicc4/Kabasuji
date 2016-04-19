package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import bounday.player.PlayerBullpenPanel;
import entity.player.Piece;

class RotateController implements ActionListener, MouseListener{

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
