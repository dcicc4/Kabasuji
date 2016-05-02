package entity.player;

import java.awt.Color;
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
		blueNumCovered.add(false);
		blueNumCovered.add(false);
		blueNumCovered.add(false);
		blueNumCovered.add(false);
		blueNumCovered.add(false);
		redNumCovered.add(false);
		redNumCovered.add(false);
		redNumCovered.add(false);
		redNumCovered.add(false);
		redNumCovered.add(false);
		redNumCovered.add(false);
		greenNumCovered.add(false);
		greenNumCovered.add(false);
		greenNumCovered.add(false);
		greenNumCovered.add(false);
		greenNumCovered.add(false);
		greenNumCovered.add(false);
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
	public
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
	
	public void setCovered(int num, Color c){
		if(c.equals(Color.red)){
			redNumCovered.set(num-1, true);
		}
		if(c.equals(Color.blue)){
			blueNumCovered.set(num-1, true);
		}
		if(c.equals(Color.green)){
			greenNumCovered.set(num-1, true);
		}
	}
	
	public String getText(Color c){
		String s = "";
		if(c.equals(Color.red)){
			s = "Red: ";
			for(int i = 0; i < redNumCovered.size(); i++){
				if(redNumCovered.get(i)){
					s = s + (i+1);
					if(i < 5){
						s = s + ", ";
					}
				}
			}
		}
		if(c.equals(Color.green)){
			s = "Green: ";
			for(int i = 0; i < greenNumCovered.size(); i++){
				if(greenNumCovered.get(i)){
					s = s + (i+1);
					if(i < 5){
						s = s + ", ";
					}
				}
			}
		}
		if(c.equals(Color.blue)){
			s = "Blue: ";
			for(int i = 0; i < blueNumCovered.size(); i++){
				if(blueNumCovered.get(i)){
					s = s + (i+1);
					if(i < 5){
						s = s + ", ";
					}
				}
			}
		}
		return s;
	}
	
}
