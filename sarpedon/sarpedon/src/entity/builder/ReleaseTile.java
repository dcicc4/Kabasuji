package entity.builder;

import entity.player.Tile;

public class ReleaseTile extends Tile {
	Integer rnumber; // the number associated with the instance of the Release Tile
	String rcolor; // the color of the instance of the ReleaseTile

	Integer getNumber(){
		return this.rnumber;
	}
	
	String getColor(){
		return this.rcolor;
	}
	
	public ReleaseTile(Integer rw, Integer cl, Integer cvrd, Integer rnum, String rcolr) {
		super(rw, cl, cvrd);
		rnumber = rnum;
		rcolor = rcolr;
	}

}
