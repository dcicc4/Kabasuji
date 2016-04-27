package entity.player;

import java.util.UUID;

import junit.framework.TestCase;
/**
 * Tests for the player.entity ReleaseTile class
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class ReleaseTileTest extends TestCase {
	/** A arbitrary tile without an UUID */
	ReleaseTile testTileOrigin;
	
	/** A arbitrary tile with a UUID */
	UUID testUUIDa;
	ReleaseTile testTile11n9UUID;
	
	/** creates Tiles for testing */
	protected void setUp() throws Exception {
		testUUIDa = UUID.randomUUID();
		testTileOrigin = new ReleaseTile(0,0,1, ReleaseTile.Color.BLUE);
    	testTile11n9UUID = new ReleaseTile(11,9,testUUIDa, 3, ReleaseTile.Color.RED);
    }
	
	public void testGetNumber() {
		assertTrue(testTileOrigin.rnumber == testTileOrigin.getNumber());
		assertTrue(testTile11n9UUID.rnumber == testTile11n9UUID.getNumber());
	}

	public void testGetColor() {
		assertTrue(testTileOrigin.rcolor == testTileOrigin.getColor());
		assertTrue(testTile11n9UUID.rcolor == testTile11n9UUID.getColor());
	}

	public void testReleaseTile() {
		UUID testUUID;
		for (int i = 0; i <= 11; i++){
			for (int j = 0; j <= 11; j++){
				for (int k = 1; k <=6; k++){
					for(ReleaseTile.Color c: ReleaseTile.Color.values()){
						testUUID = UUID.randomUUID();
						ReleaseTile testTile = new ReleaseTile(i,j, testUUID, k, c);
						assertTrue(testTile.col == j);
						assertTrue(testTile.row == i);
						assertTrue(testTile.coveredBy == testUUID);
						assertTrue(testTile.rnumber == k);
						assertTrue(testTile.rcolor == c);
					}
				}
			}
		}
	}
	
	public void testGetColorString(){
		assertTrue("BLUE".compareTo(testTileOrigin.getColorString())==0);
		assertTrue("RED".compareTo(testTile11n9UUID.getColorString())==0);
		
		ReleaseTile testTile = new ReleaseTile(6,6,3,ReleaseTile.Color.GREEN);
		assertTrue("GREEN".compareTo(testTile.getColorString())==0);
		
		ReleaseTile testTile2 = new ReleaseTile(6,6,3,ReleaseTile.Color.NONE);
		assertTrue("NONE".compareTo(testTile2.getColorString())==0);
	}

}
