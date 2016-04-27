package control.builder;

import java.awt.event.MouseEvent;

import boundary.builder.BuilderBullpenPanel;
import boundary.builder.BuilderStockPanel;
import entity.player.Bullpen;
import junit.framework.TestCase;

public class BuilderControlTest extends TestCase {
	public void testAddPieceToBullpeController() {
		Bullpen bp = new Bullpen();
		BuilderStockPanel bsp = new BuilderStockPanel();
		BuilderBullpenPanel bbp = new BuilderBullpenPanel(bp);
		AddPieceToBullpenController aptbc = new AddPieceToBullpenController(bp, bsp, bbp);
		aptbc.mousePressed(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
		aptbc.
	}
}
