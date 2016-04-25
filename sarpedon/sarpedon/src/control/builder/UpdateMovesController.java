package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.builder.BuildablePuzzle;

public class UpdateMovesController implements ActionListener{

	JTextField moves;
	BuildablePuzzle model;
	JLabel error;
	
	public UpdateMovesController(JTextField tf, BuildablePuzzle m, JLabel e){
		moves = tf;
		model = m;
		error = e;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		Integer totalMoves = Integer.valueOf(moves.getText());
		model.setMovesAllotted(totalMoves);
		} catch(NumberFormatException string){
			error.setText("Please enter a valid number.");
		}
	}

	
}
