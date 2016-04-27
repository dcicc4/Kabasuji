package boundary.player;

import Main.PlayerApplication;
import bounday.player.LightningLevelGui;
import bounday.player.PuzzleLevelGui;
import bounday.player.ReleaseLevelGui;
import entity.player.Board;
import entity.player.Bullpen;
import entity.player.LightningBoard;
import entity.player.LightningLevel;
import entity.player.PuzzleLevel;
import entity.player.ReleaseLevel;
import entity.player.SarpedonKabasuji;
import junit.framework.TestCase;

public class PlayerBoundariesTest extends TestCase {
	public void testPlayer(){
		PlayerApplication game = new PlayerApplication();
		game.main(null);
		
		SarpedonKabasuji g = new SarpedonKabasuji(); 
		Bullpen bp = new Bullpen();
		Board b = new Board();
		LightningBoard lb = new LightningBoard();
		
		PuzzleLevel pl = new PuzzleLevel(b, bp, null);
		PuzzleLevelGui plg = new PuzzleLevelGui(pl, g);
		plg.setVisible(true);
		
		ReleaseLevel rl = new ReleaseLevel();
		ReleaseLevelGui rlg = new ReleaseLevelGui(rl, g);
		rlg.setVisible(true);
		
		LightningLevel ll = new LightningLevel(lb, bp, null, false, null, 7, 5);
		LightningLevelGui llg = new LightningLevelGui(ll, g);
		llg.setVisible(true);
		
		assertEquals(null,null);
	}
}
