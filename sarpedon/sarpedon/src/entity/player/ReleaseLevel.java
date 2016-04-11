package entity.player;

import java.util.ArrayList;

public class ReleaseLevel extends Level {
	public static final int MAX_NUM = 6;
	
	ArrayList <Boolean> blueNumCovered;
	ArrayList <Boolean> greenNumCovered;
	ArrayList <Boolean> redNumCovered;
	Integer numBlue;
	Integer numGreen;
	Integer numRed;

	
	public ReleaseLevel(ReleaseBoard rboard, Bullpen bull, Integer strs,
			boolean cmplted, ArrayList<Hint> hnts) {
		super(rboard, bull, strs, cmplted, hnts);
		//stub
	}
	
	// better way to handle variable types?
	boolean calculateColor(String str){
		int numColor = 0;
		if (str.compareToIgnoreCase("blue") == 0){
			for (Boolean b: blueNumCovered){
				if (b == true){
					numColor += 1;
				}
			}
			numBlue = numColor;
			return true;
		}
		else if (str.compareToIgnoreCase("green")==0){
			for (Boolean b: greenNumCovered){
				if (b == true){
					numColor += 1;
				}
			}
			numGreen = numColor;
			return true;
		}
		else if (str.compareToIgnoreCase("red")==0){
			for (Boolean b: redNumCovered){
				if (b == true){
					numColor += 1;
				}
			}
			numRed = numColor;
			return true;
		}
		else {
			return false;
		}
	}
	
	void updateStars(){
		this.calculateColor("blue");
		this.calculateColor("green");
		this.calculateColor("red");
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
