package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Main.BuilderApplication;
import boundary.builder.BuilderBoardPanel;
import boundary.builder.BuilderBullpenPanel;
import boundary.builder.BuilderStockPanel;
import boundary.builder.LevelBuilderGui;
import boundary.builder.LoadGui;
import entity.builder.BuildableRelease;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.Level;
import entity.player.Piece;
import entity.player.ReleaseLevel;
import entity.player.SarpedonKabasuji;
import entity.player.Square;
import junit.framework.TestCase;

public class BuilderControlTest extends TestCase {
	Bullpen bp;
	BuilderStockPanel bsp;
	BuilderBullpenPanel bbp;
	BuildableRelease br;
	AddPieceToBullpenController aptbc;
	BuilderBoardPanel bbop;
	BackToStockController btsc;
	JComboBox<Integer> jcb;
	BoardSizeController bsc;
	Board b;
	BullpenToBoardController btbp;
	FlipController fc;
	BuilderApplication ba;
	SarpedonKabasuji sk;
	JTextField jtf;
	LevelBuilderGui lbg;
	LoadGui lg;
	LoadExistingToEditController letec;
	LevelNumberController lnc;
	ReleaseLevel rl;
	Piece p;
	Square s1;
	Square s2;
	Square s3;
	Square s4;
	Square s5;
	Square s6;
	
	protected void setUp() throws Exception{
		super.setUp();
		bp = new Bullpen();
		bsp = new BuilderStockPanel();
		bbp = new BuilderBullpenPanel(bp);
		br = new BuildableRelease();
		aptbc = new AddPieceToBullpenController(bp, bsp, bbp);
		bbop = new BuilderBoardPanel(br);
		btsc = new BackToStockController(bp, bsp, bbop);
		jcb = new JComboBox<Integer>();
		bsc = new BoardSizeController(jcb, bbop, bbp, br);
		b = new Board();
		btbp = new BullpenToBoardController(b, bp, bbop, bbp);
		fc = new FlipController(bbop, br, false);
		fc = new FlipController(bbop, br, false);
		ba = new BuilderApplication();
		sk = new SarpedonKabasuji();
		jtf = new JTextField();
		lbg = new LevelBuilderGui();
		lg = new LoadGui(lbg);
		letec = new LoadExistingToEditController(jtf, lg);
		rl = new ReleaseLevel();
		lnc = new LevelNumberController(rl, sk);
		s1 = new Square(0, 0);
		s2 = new Square(0, 1);
		s3 = new Square(0, 2);
		s4 = new Square(0, 3);
		s5 = new Square(0, 4);
		p = new Piece(0, s1, s2, s3, s4, s5);
	}
	
	
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
	public void testBoardSizeController() {
		jcb.setBounds(220, 141, 85, 45);
		jcb.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}));
		jcb.setSelectedIndex(23);
		bbp.repaint();
		//bsc.actionPerformed(null);
	}
	//public void testSomething() {
	//	game.main(null);
	//}
	public void testBullpenToBoardController() {
		bbop.repaint();
		btbp.mouseDragged(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		btbp.mouseEntered(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		//btbp.mouseExited(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		btbp.mouseMoved(new MouseEvent(bbop, 0, 0, 0, 0, 0, 0, false));
		btbp.move(p, 0, 0);
	}
	public void testFlipController() {
		fc.actionPerformed(new ActionEvent(bbp, 0, null));
	}
	public void testLevelNumberController() {
		lnc.changeLevelNumber(5);
	}
	public void testLoadExistingToEditController() {
		letec.actionPerformed(null);
		jtf.setText("Level1");
	}
}
