package control.player;

import java.awt.event.MouseEvent;

import bounday.player.LevelSelectGui;
import bounday.player.LightningLevelGui;
import bounday.player.PlayerBoardPanel;
import bounday.player.PlayerBullpenPanel;
import bounday.player.PuzzleLevelGui;
import bounday.player.ReleaseLevelGui;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.LightningLevel;
import entity.player.Piece;
import entity.player.PuzzleLevel;
import entity.player.ReleaseLevel;
import entity.player.SarpedonKabasuji;
import entity.player.Square;
import junit.framework.TestCase;

public class PlayerControlTest extends TestCase {
	BullpenToBoardController btbc;
	Board b;
	Bullpen bp;
	PlayerBoardPanel pbp;
	PlayerBullpenPanel pbup;
	PuzzleLevel pl;
	ReleaseLevel rl;
	LightningLevel ll;
	Piece p;
	Square s1, s2, s3, s4, s5;
	EndLevelController elc;
	SarpedonKabasuji sk;
	PuzzleLevelGui plg;
	LightningLevelGui llg;
	ReleaseLevelGui rlg;
	FlipController fc;
	LevelSelectController lsc;
	LevelSelectGui lsg;
	Loader l;
	NewGameController ngc;
	
	protected void setUp() throws Exception{
		super.setUp();
		b = new Board();
		bp = new Bullpen();
		pl = new PuzzleLevel();
		rl = new ReleaseLevel();
		ll = new LightningLevel();
		pbp = new PlayerBoardPanel(pl);
		pbup = new PlayerBullpenPanel(bp);
		btbc = new BullpenToBoardController(b, bp, pbp, pbup);
		s1 = new Square(0, 0);
		s2 = new Square(0, 1);
		s3 = new Square(0, 2);
		s4 = new Square(0, 3);
		s5 = new Square(0, 4);
		p = new Piece(0, s1, s2, s3, s4, s5);
		sk = new SarpedonKabasuji();
		plg = new PuzzleLevelGui(pl, sk);
		rlg = new ReleaseLevelGui(rl, sk);
		llg = new LightningLevelGui(ll, sk);
		elc = new EndLevelController(sk, rlg, rl);
		fc = new FlipController(pbp, rl, false);
		lsg = new LevelSelectGui(sk);
		lsc = new LevelSelectController(lsg, rl);
		l = new Loader();
		ngc = new NewGameController(sk);
	}
	public void testBullpenToBoardController() {
		btbc.mouseDragged(null);
		btbc.mouseEntered(new MouseEvent(pbp, 0, 0, 0, 0, 0, 0, false));
		//btbc.mouseExited(null);
		btbc.mouseMoved(null);
		btbc.move(p, 0, 0);
	}
	public void testEndLevelController() {
		rl.setNumber(1);
		sk.setLevel(rl);
		elc.mouseClicked(null);
		elc.mouseEntered(null);
		elc.mouseExited(null);
		elc.mousePressed(null);
		elc.mouseReleased(null);
	}
	public void testFlipController() {
		fc.actionPerformed(null);
	}
	public void testLevelSelectController() {
		lsc.start(rl);
	}
	public void testLoader() {
		l.getLevel(1);
		l.getMomento(1);
	}
	public void testNewGameController() {
		ngc.actionPerformed(null);
	}
}
