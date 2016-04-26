package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import entity.builder.BuildableRelease;
import entity.player.*;

import javax.swing.*;

import boundary.builder.BuilderBoardPanel;
/**
 * Allows the adding of hints
 * @author Drew
 *
 */
public class HintController extends MouseAdapter{

	BuildableRelease amodel;
	JRadioButton addHint;
	BuilderBoardPanel bV;
	JComboBox<String> colorCombo;
	JComboBox<Integer> numberCombo;
	
	public HintController(BuildableRelease model, BuilderBoardPanel boardView, JRadioButton addHintRadio, JComboBox<String> colorCombo, JComboBox<Integer> numberCombo){
		this.amodel = model;
		this.bV =boardView;
		this.addHint = addHintRadio;
		this.colorCombo = colorCombo;
		this.numberCombo = numberCombo;
	}
	

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (addHint.isSelected())
		{
			
		}
	}
}