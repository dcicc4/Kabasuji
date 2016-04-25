package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.builder.BuildableLightning;
import entity.builder.BuildablePuzzle;

/**
 * Handles updating the time allotted in a built lightningLevel.
 * @author Nathan
 *
 */
public class UpdateTimeController implements ActionListener{

	JTextField timeAllotted;
	BuildableLightning model;
	JLabel error;
	
	public UpdateTimeController(JTextField time, BuildableLightning m, JLabel e	){
		timeAllotted = time;
		model = m;
		error = e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			Integer time = Integer.valueOf(timeAllotted.getText());
			if(time <= 0){error.setText("Please enter a number greater than 0");}
			model.setTimeAllotted(time);
		} catch (NumberFormatException string){
			error.setText("Please enter a valid number.");
		}
	}
}
