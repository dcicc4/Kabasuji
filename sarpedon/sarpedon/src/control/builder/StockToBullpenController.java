package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class StockToBullpenController implements ActionListener{

	Bullpen bullpen;
	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public StockToBullpenController(Bullpen newbullpen, BuilderBullpenPanel newbullpenPanel){
		bullpen = newbullpen;
		bullpenPanel = newbullpenPanel;
	}
	
	public void move(Piece piece, int col, int row){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
