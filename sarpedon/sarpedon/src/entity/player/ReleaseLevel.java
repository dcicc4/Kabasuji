package entity.player;

import java.util.ArrayList;
/**
 * Implementation of the abstract superclass Level for the Release variation
 * @Tesia Shizume (ttshiz@wpi.edu)
 */
public class ReleaseLevel extends Level {
	private static final long serialVersionUID = 1L;

	public static final int MAX_NUM = 6;
	/** Arrays to store whether each number is covered */
	ArrayList <Boolean> blueNumCovered = new ArrayList<Boolean>();
	ArrayList <Boolean> greenNumCovered = new ArrayList<Boolean>();
	ArrayList <Boolean> redNumCovered = new ArrayList<Boolean>();
	/** counts of the number of distinct instances of a given 
	 * number-color combination that are covered */
	Integer numBlue = 0;
	Integer numGreen = 0;
	Integer numRed = 0;
	
	/**
	 * constructor calls the super with the "Release" option
	 */
	public ReleaseLevel() {
		super("Release");
	}
	
	/** 
	 * calculates and updates the current counts per color of 
	 * distinct number-color combinations 
	 */
	void calculateColor(ArrayList <Boolean> numCovered, Integer numColor){
		int nC = 0; 
		for (Boolean b: numCovered){
			if (b == true){
				nC += 1;
			}
		}
//		for (int i = 0; i <= numCovered.size() - 1; i++){
//			Boolean b = numCovered.get(i);
//			if (b == true){
//				nC += 1;
//			}
		numColor = nC;
	}
	
	/** 
	 * Updates the stars earned for a given play-through 
	 */
	@Override
	void updateStars(){
		this.calculateColor(blueNumCovered, numBlue);
		this.calculateColor(greenNumCovered, numGreen);
		this.calculateColor(redNumCovered, numRed);
		int numStars = 0;
		if (numGreen == MAX_NUM){
			numStars += 1;
		}
		if (numBlue == MAX_NUM){
			numStars += 1;
		}
		if (numRed == MAX_NUM){
			numStars += 1;
		}
		this.stars = numStars;
	}
	
	/** 
	 *  getter for whether a level has been completed
	 *  @return true if the level has been completed, otherwise false
	 */
	@Override
	public boolean getCompleted(){
		return super.getCompleted() || bullpen.getPieces().isEmpty();
	}
	
	/**
	 * Restores a level from a LevelMomento
	 */
	public void restore(LevelMomento m){
		board = (ReleaseBoard)m.board;
		bullpen = m.bullpen;
		stars = m.stars;
		hints = m.hints;
		type = m.type;
		completed = m.completed;
		number = m.number;
	}
	
}
