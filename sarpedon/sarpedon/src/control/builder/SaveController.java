package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

import entity.builder.BuilderModel;
import entity.player.Level;

public class SaveController extends MouseAdapter {

	String s;
	JButton aButt;
	Level aLevel;

	public SaveController(JButton aButt, String s, BuilderModel model) {
		this.s = s;
		this.aButt = aButt;
		aLevel = model;
		
	}

	public void mousePressed(MouseEvent a) {
		{
			try {
				
				System.out.println("Created successfully "+out.getAbsolutePath());
				FileOutputStream saveFile = new FileOutputStream("C:\Users\dcicc\Desktop\" +s);
				ObjectOutputStream save = new ObjectOutputStream(saveFile);
				save.writeObject(aLevel);
				save.close();
		System.exit(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
