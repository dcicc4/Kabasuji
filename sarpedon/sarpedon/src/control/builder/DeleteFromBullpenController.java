package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;
//import entity.builder.*;

//import javax.swing.*;

public class DeleteFromBullpenController implements ActionListener{

	Bullpen bullpen;
	BuilderStockPanel stockPanel;
	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public DeleteFromBullpenController(Bullpen newbullpen, BuilderStockPanel newstockPanel, BuilderBullpenPanel newbullpenPanel){
		bullpen = newbullpen;
		stockPanel = newstockPanel;
		bullpenPanel = newbullpenPanel;
	}
	
	public void move(Piece piece, int col, int row){
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}