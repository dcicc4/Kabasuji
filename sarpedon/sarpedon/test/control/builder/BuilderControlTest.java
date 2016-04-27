package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import Main.BuilderApplication;
import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
import boundary.builder.BuilderStockPanel;
import entity.builder.BuildableRelease;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.SarpedonKabasuji;
import junit.framework.TestCase;

public class BuilderControlTest extends TestCase {
	Bullpen bp = new Bullpen();
	BuilderStockPanel bsp = new BuilderStockPanel();
	BuilderBullpenPanel bbp = new BuilderBullpenPanel(bp);
	BuildableRelease br = new BuildableRelease();
	AddPieceToBullpenController aptbc = new AddPieceToBullpenController(bp, bsp, bbp);
	BuilderBoardPanel bbop = new BuilderBoardPanel(null);
	BackToStockController btsc = new BackToStockController(bp, bsp, bbop);
	JComboBox<Integer> jcb = new JComboBox<Integer>();
	BoardSizeController bsc = new BoardSizeController(jcb, bbop, bbp, br);
	Board b = new Board();
	BullpenToBoardController btbp = new BullpenToBoardController(b, bp, bbop, bbp);
	FlipController fc = new FlipController(bbop, br, false);
	BuilderApplication ba = new BuilderApplication();
	SarpedonKabasuji sk = new SarpedonKabasuji();
	
	//LevelNumberController lnc = new LevelNumberController(br, sk);
	
	
	public void testAddPieceToBullpeController() {
		aptbc.mousePressed(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
	}
	public void testBackToStockController() {
		btsc.mouseClicked(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
		btsc.mousePressed(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
		btsc.mouseReleased(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
		btsc.mouseEntered(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
		btsc.mouseExited(new MouseEvent(bbp, 0, 0, 0, 0, 0, 0, false));
	}
	//public void testBoardSizeController() {
	//	jcb.setBounds(220, 141, 85, 45);
	//	jcb.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}));
	//	jcb.setSelectedIndex(23);
	//	bsc.actionPerformed(null);
	//}
	//public void testSomething() {
	//	game.main(null);
	//}
	public void testBullpenToBoardController() {
		btbp.mouseDragged(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		btbp.mouseEntered(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		//btbp.mouseExited(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		btbp.mouseMoved(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		//btbp.move(piece, col, row);
	}
	public void testFlipController() {
		fc.actionPerformed(new ActionEvent(bbp, 0, null));
	}
	//public void testLevelNumberController() {
	//	lnc.changeLevelNumber(5);
	//}
}
