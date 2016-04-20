package entity.player;
import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;

public class PieceBuilder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HashMap<Integer, Piece> pieces = new HashMap<Integer, Piece>();
	Color[] palette = new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW, Color.ORANGE};

	final Square R = new Square(1, 0);
	final Square D = new Square(0, 1);
	final Square L = new Square(-1, 0);

	final Square R2 = new Square(2, 0);
	final Square D2 = new Square(0, 2);
	final Square L2 = new Square(-2, 0);

	final Square D3 = new Square(0, 3);
	final Square D4 = new Square(0, 4);
	final Square D5 = new Square(0, 5);

	final Square DL = new Square(-1, 1);
	final Square DR = new Square(1, 1);

	final Square D2L = new Square(-1, 2);
	final Square D2R = new Square(1, 2);

	final Square D3L = new Square(-1, 3);
	final Square D3R = new Square(1, 3);

	final Square D4L = new Square(-1, 4);
	final Square D4R = new Square(1, 4);

	final Square DL2 = new Square(-2, 1);
	final Square DR2 = new Square(2, 1);

	final Square D2L2 = new Square(-2, 2);
	final Square D2R2 = new Square(2, 2);

	final Square D3L2 = new Square(-2, 3);
	final Square D3R2 = new Square(2, 3);

	Piece P1 = new Piece(1,  D, D2, D3, D4, D5 );

	Piece P2 = new Piece(2,  D, D2, D3, D4, R );

	Piece P3 = new Piece(3,  D, D2, D3, D4, D3L );

	Piece P4 = new Piece(4,  D, D2, D3, D4, D2R );

	Piece P5 = new Piece(5,  D, D2, D3R, D2R, L ); // rotated
	// clockwise
	// once

	Piece P6 = new Piece(6,  D, D2, D3R, D2R, D4R ); // rotated
	// clockwise
	// once

	Piece P7 = new Piece(7,  D, D2L, D3L, DL, D4L );

	Piece P8 = new Piece(8,  D, D2, D3, D2L, D3L );

	Piece P9 = new Piece(9,  D, D2, D3, D3R, L );

	Piece P10 = new Piece(10,  D, R, L, D2, D3 );

	Piece P11 = new Piece(11,  D, D2, D3, D3L, D3L2 );

	Piece P12 = new Piece(12,  D, D2, R, DR, D2R );

	Piece P13 = new Piece(13,  D, R, DL, D2L, D3L );

	Piece P14 = new Piece(14,  D, DL, D2L, D2L2, D3L2 );

	Piece P15 = new Piece(15,  D, D2, D3, DL, D2L );

	Piece P16 = new Piece(16,  D, D2, D3, DL, DR );

	Piece P17 = new Piece(17,  D, D2, D3, D3R, DR );

	Piece P18 = new Piece(18,  D, D2, D2R, D2R2, D3R );

	Piece P19 = new Piece(19,  D, D2, D2L, D2L2, D3L2 ); // rotated
	// clockwise

	Piece P20 = new Piece(20,  D, D2, D2R, D3R, DR ); // rotated
	// clockwise

	Piece P21 = new Piece(21,  D, D2, D2R, L, DL ); // rotated
	// clockwise

	Piece P22 = new Piece(22,  D, D2, DL, D2L, DR );

	Piece P23 = new Piece(23,  D, D2, D3, L, D3L );

	Piece P24 = new Piece(24,  D, DL, DR, D2L, D2R );

	Piece P25 = new Piece(25,  D, D2, L, L2, DL2 ); // rotated
	// clockwise

	Piece P26 = new Piece(26,  D, D2, R, R2, DR ); // rotated
	// clockwise

	Piece P27 = new Piece(27,  D, D2, D3, L, DR);

	Piece P28 = new Piece(28,  D, D2, D3, D2L, D2L2 );

	Piece P29 = new Piece(29,  D, D2, R, D2R, D3R ); // rotated
	// clockwise

	Piece P30 = new Piece(30,  D, D2, L, D2L, D2R ); // rotated
	// clockwise

	Piece P31 = new Piece(31,  D, D2, D2R, DR, DR2 ); 

	Piece P32 = new Piece(32,  D, D2, D3L, D2L, D2R );

	Piece P33 = new Piece(33,  D, D2, D3, D2L, R ); // rotated
	// clockwise

	Piece P34 = new Piece(34,  D, D2, D3, DR, D2L ); // rotated
	// clockwise

	Piece P35 = new Piece(35,  D, DR, D2R, D2R2, D3R ); // rotated
	// clockwise

	public PieceBuilder(){
		//make all pieces then set their colors
		initialize();
		for(int i=1; i<36; i++ ){
			pieces.get(i).setColor(palette[i%palette.length]);
		}
	}
	
	public void initialize() {
		pieces.put(1,P1);
		pieces.put(2,P2);
		pieces.put(3,P3);
		pieces.put(4,P4);
		pieces.put(5,P5);
		pieces.put(6,P6);
		pieces.put(7, P7);
		pieces.put(8, P8);
		pieces.put(9, P9);
		pieces.put(10, P10);

		pieces.put(11, P11);
		pieces.put(12, P12);
		pieces.put(13, P13);
		pieces.put(14, P14);
		pieces.put(15, P15);
		pieces.put(16, P16);
		pieces.put(17, P17);
		pieces.put(18, P18);
		pieces.put(19, P19);
		pieces.put(20, P20);

		pieces.put(21,P21);
		pieces.put(22,P22);
		pieces.put(23,P23);
		pieces.put(24,P24);
		pieces.put(25,P25);
		pieces.put(26, P26);
		pieces.put(27, P27);
		pieces.put(28, P28);
		pieces.put(29, P29);
		pieces.put(30, P30);

		pieces.put(31, P31);
		pieces.put(32,P32);
		pieces.put(33, P33);
		pieces.put(34, P34);
		pieces.put(35, P35);

	}

	public Piece getPiece (int num){
		return pieces.get(num);
	}
}
