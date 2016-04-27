package boundary.player;

import Main.PlayerApplication;
import junit.framework.TestCase;

public class PlayerBoundariesTest extends TestCase {
	public void testPlayer(){
		PlayerApplication game = new PlayerApplication();
		game.main(null);
		assertEquals(null,null);
	}
}
