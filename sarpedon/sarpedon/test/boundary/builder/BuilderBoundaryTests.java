package boundary.builder;

import junit.framework.TestCase;

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
		
		assertEquals(null,null);
	}
}