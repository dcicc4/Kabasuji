package boundary.builder;

import junit.framework.TestCase;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.MouseEvent;
//import javax.swing.JPanel;
//import javax.swing.SwingConstants;
//import javax.swing.border.EmptyBorder;
import Main.BuilderApplication;
import boundary.builder.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import entity.builder.BuildableLightning;
import entity.builder.BuildablePuzzle;
import entity.builder.BuildableRelease;
import entity.player.ReleaseTile;
import entity.player.Tile;


public class BuilderBoundaryTests extends TestCase {


	
	public void testBuilderBoundry(){
		BuilderApplication game = new BuilderApplication();
		game.main(null);
		
		BuildableLightning model = new BuildableLightning();
		LightningBuilderGui lbg = new LightningBuilderGui(model);
		lbg.setVisible(true);
		
		BuildablePuzzle model2 = new BuildablePuzzle();
		PuzzleBuilderGui pbg = new PuzzleBuilderGui(model2);
		pbg.setVisible(true);
		
		BuildableRelease model3 = new BuildableRelease();
		ReleaseBuilderGui rbg = new ReleaseBuilderGui(model3);
		rbg.setVisible(true);
		
		/*ReleaseTile t = new ReleaseTile(1, 5, 3, Color.white);
		Tile tt[][] = {{t},{t,t}};
		BuilderBoardPanel bbp = new BuilderBoardPanel(null);
		Graphics offScreenGraphics = null;
		Graphics g = offScreenGraphics.getGraphics();
		bbp.drawReleaseBoard(tt, g);*/
		
		assertEquals(model.getType(),"Lightning");
		assertEquals(model2.getType(),"Puzzle");
		assertEquals(model3.getType(),"Release");
	}
}