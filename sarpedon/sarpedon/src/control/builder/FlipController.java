package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class FlipController implements ActionListener{

	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public FlipController(BuilderBullpenPanel newbullpenPanel, Piece newpiece){
		bullpenPanel = newbullpenPanel;
		piece = newpiece;
	}
	
	public void flip(boolean direction){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}