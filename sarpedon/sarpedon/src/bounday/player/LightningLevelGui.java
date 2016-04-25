package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boundary.builder.BuilderBoardPanel;
import control.player.*;
import entity.player.*;

import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;
/**
 * Displays interface for a playable lightning level
 * 
 * @author Nathan
 *
 */
public class LightningLevelGui extends JFrame {

	private JPanel contentPane;

	JLabel lblStars;
	JLabel lblTime;
	
	JButton btnReset;
	JButton btnReturn;
	JButton btnRotateClockwise;
	JButton btnrotateCClockwise;
	JButton btnFlipVert;
	JButton btnFlipHor;

	PlayerBullpenPanel bullpenView;
	PlayerBoardPanel boardView;
	
	LightningLevel level;
	
	public PlayerBullpenPanel getBullpenView(){
		return bullpenView;
	}
	public PlayerBoardPanel getBoardView(){
		return boardView;
	}
	public JLabel getStarsView(){
		return lblStars;
	}
	public void setStarsView(String s){
		lblStars.setText(s); 
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PieceBuilder pb = new PieceBuilder();
					LightningBoard lBoard= new LightningBoard();
					Bullpen bp = new Bullpen();
					bp.addPiece(pb.getPiece(1));
					LightningLevel l = new LightningLevel(lBoard, bp, 0, false, null, 100);
					LightningLevelGui frame = new LightningLevelGui(l);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LightningLevelGui(LightningLevel l) {
		level = l;
		setTitle("Lightning Level");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 503, 600, 300);
		contentPane.add(scrollPane);
		
		bullpenView = new PlayerBullpenPanel(l.getBullpen());
		bullpenView.setPreferredSize(new Dimension(1200, 150));
		scrollPane.setViewportView(bullpenView);
		
		JLabel lblTimeLeft = new JLabel("Time Left:");
		lblTimeLeft.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblTimeLeft.setBounds(10, 333, 271, 49);
		contentPane.add(lblTimeLeft);
		
		lblTime = new JLabel(level.getTimeLeft().toString());
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblTime.setBounds(300, 333, 122, 49);
		contentPane.add(lblTime);
		
		lblStars = new JLabel("Stars: 0");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblStars.setBounds(10, 251, 344, 54);
		contentPane.add(lblStars);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(45, 167, 171, 41);
		contentPane.add(btnReset);
		
		JLabel lblLevel = new JLabel("Level 2");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(174, 11, 327, 82);
		contentPane.add(lblLevel);
		
		btnReturn = new JButton("Return to Main Menu");
		btnReturn.setBackground(Color.LIGHT_GRAY);
		btnReturn.setBounds(300, 167, 171, 41);
		contentPane.add(btnReturn);
		
		boardView = new PlayerBoardPanel(l);
		boardView.setBounds(620, 83, 720, 720);
		contentPane.add(boardView);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(1350, 83, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnrotateCClockwise = new JButton("Rotate C. Clockwise");
		btnrotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnrotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnrotateCClockwise.setBounds(1350, 257, 125, 125);
		contentPane.add(btnrotateCClockwise);
		
		btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1350, 503, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1350, 678, 125, 125);
		contentPane.add(btnFlipHor);
		
		//attach controllers
		btnFlipVert.addActionListener(new FlipController(boardView, level, true));
		btnFlipHor.addActionListener(new FlipController(boardView, level, false));
		btnRotateClockwise.addActionListener(new RotateController(boardView, level, true));
		btnrotateCClockwise.addActionListener(new RotateController(boardView, level, false));
		
		SelectPieceController spc = new SelectPieceController(level, boardView, bullpenView);
		bullpenView.addMouseListener(spc);
		BullpenToBoardController movePiece = new BullpenToBoardController(level.getBoard(), level.getBullpen(), boardView, bullpenView);
		boardView.addMouseMotionListener(movePiece);
		boardView.addMouseListener(new PlaceLightningPieceController(level, this));
		
		ActionListener updateTime = new TimeController(level, lblTime);
		Timer timer = new Timer(1000, updateTime);
		timer.start();
	}

}
