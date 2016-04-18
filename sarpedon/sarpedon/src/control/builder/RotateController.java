package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class RotateController implements ActionListener{

	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public RotateController(BuilderBullpenPanel newbullpenPanel, Piece newpiece){
		bullpenPanel = newbullpenPanel;
	}
	
	public void rotate(boolean direction){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
