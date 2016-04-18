package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;
import entity.builder.*;

//import javax.swing.*;

public class BullpenToStockController implements ActionListener{

	PieceStock stock;
	Bullpen bullpen;
	BuilderStockPanel stockPanel;
	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public BullpenToStockController(PieceStock newstock, Bullpen newbullpen, BuilderStockPanel newstockPanel, BuilderBullpenPanel newbullpenPanel){
		stock = newstock;
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