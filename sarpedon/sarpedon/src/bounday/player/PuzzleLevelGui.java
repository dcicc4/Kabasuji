package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boundary.builder.BuilderBoardPanel;

import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class PuzzleLevelGui extends JFrame {

	private JPanel contentPane;
	
	JLabel lblStars;
	JLabel lblMoves;
	
	JButton btnReset;
	JButton btnReturn;
	JButton btnRotateClockwise;
	JButton btnrotateCClockwise;
	JButton btnFlipVert;
	JButton btnFlipHor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleLevelGui frame = new PuzzleLevelGui();
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
	public PuzzleLevelGui() {
		setTitle("Puzzle Level");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
		panel.setBounds(620, 123, 720, 720);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 522, 600, 300);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollPane.setColumnHeaderView(scrollBar);
		
		JLabel lblNewLabel = new JLabel("Moves Left:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel.setBounds(26, 350, 271, 49);
		contentPane.add(lblNewLabel);
		
		lblMoves = new JLabel("0");
		lblMoves.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblMoves.setBounds(316, 350, 122, 49);
		contentPane.add(lblMoves);
		
		lblStars = new JLabel("Stars");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblStars.setBounds(26, 268, 144, 54);
		contentPane.add(lblStars);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(61, 184, 171, 41);
		contentPane.add(btnReset);
		
		JLabel lblLevel = new JLabel("Level 1");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(190, 28, 327, 82);
		contentPane.add(lblLevel);
		
		btnReturn = new JButton("Return to Main Menu");
		btnReturn.setBackground(Color.LIGHT_GRAY);
		btnReturn.setBounds(316, 184, 171, 41);
		contentPane.add(btnReturn);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(1349, 123, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1349, 718, 125, 125);
		contentPane.add(btnFlipHor);
		
		btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1349, 543, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnrotateCClockwise = new JButton("Rotate C. Clockwise");
		btnrotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnrotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnrotateCClockwise.setBounds(1349, 297, 125, 125);
		contentPane.add(btnrotateCClockwise);
	}
}
