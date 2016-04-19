package entity.player;

public class SarpedonKabasuji {
	Level[] levels;
	boolean gameOver;
	int currentLevel;
	
	public void SarpedonKabasuji(Level[] lvls){
		levels = lvls;
	}

	Level nextLevel(){
		Level nxtlvl = levels[currentLevel+1];
		if(nxtlvl != null){
			return nxtlvl;
		} else {
			throw new RuntimeException("SarpedonKabasuji: no next level");
		}
	}
	public static void main(String[] args) {
		// stub

	}

}
