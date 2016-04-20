package entity.player;

import java.util.ArrayList;

public class ReleaseLevel extends Level {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int MAX_NUM = 6;
	
	ArrayList <Boolean> blueNumCovered;
	ArrayList <Boolean> greenNumCovered;
	ArrayList <Boolean> redNumCovered;
	Integer numBlue;
	Integer numGreen;
	Integer numRed;
	// change to purely dynamically calculated?

	
	public ReleaseLevel(ReleaseBoard rboard, Bullpen bull, Integer strs,
			boolean cmplted, ArrayList<Hint> hnts) {
		super(rboard, bull, strs, cmplted, hnts);
	}
	
	void calculateColor(ArrayList <Boolean> numCovered, Integer numColor){
		int nC = 0;
		for (Boolean b: numCovered){
			if (b == true){
				nC += 1;
			}
		}
		numColor = nC;
	}
	
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
	
}
