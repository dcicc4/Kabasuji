package entity.player;

import control.player.Loader;

public class SarpedonKabasuji {
	Level[] levels = new Level[15];
	boolean gameOver;
	int unlockedLevels;
	
	public SarpedonKabasuji(){
		Loader loader = new Loader();
		for(int i = 0; i<15; i++){
		levels[i] = loader.getLevel(i+1);
		}
		gameOver = false;
		unlockedLevels = 1;
	}

	Level nextLevel(){
		Level nxtlvl = levels[unlockedLevels+1];
		if(nxtlvl != null){
			return nxtlvl;
		} else {
			throw new RuntimeException("SarpedonKabasuji: no next level");
		}
	}
	public boolean getGameOver(){
		return gameOver;
	}
	public int getCurrentLevel(){
		return unlockedLevels;
	}
	/**
	 * returns the ith level.
	 * e.g. if i=1, it will return level one.
	 * @param i
	 * @return
	 */
	public Level getLevel(int i){
		return levels[i-1];
	}
	/**
	 * increment the number of unlocked levels
	 */
	public void incrementLevel(){
		unlockedLevels++;
	}
	public Level[] getLevels(){
		return levels;
	}

}
