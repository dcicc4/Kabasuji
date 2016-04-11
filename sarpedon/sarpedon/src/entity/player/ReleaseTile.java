package entity.player;

public class ReleaseTile extends Tile {
	Integer number;
	String color;

	Integer getNumber(){
		return this.number;
	}
	
	String getColor(){
		return this.color;
	}
	
	public ReleaseTile(Integer rw, Integer cl, boolean cvrd, Integer num, String colr) {
		super(rw, cl, cvrd);
		number = num;
		color = colr;
	}

}
