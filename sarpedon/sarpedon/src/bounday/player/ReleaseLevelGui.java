package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boundary.builder.BuilderBoardPanel;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class ReleaseLevelGui extends JFrame {

	private JPanel contentPane;

	JLabel lblStars;
	JLabel lblRedNums;
	JLabel lblBlueNums;
	JLabel lblGreenNums;
	
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
					ReleaseLevelGui frame = new ReleaseLevelGui();
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
	public ReleaseLevelGui() {
		setTitle("Release Level");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
		panel.setBounds(620, 126, 720, 720);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 544, 600, 300);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setForeground(Color.LIGHT_GRAY);
		scrollBar.setBackground(Color.WHITE);
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollPane.setColumnHeaderView(scrollBar);
		
		JLabel lblNumbersCovered = new JLabel("Numbers Covered:");
		lblNumbersCovered.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNumbersCovered.setBounds(31, 334, 420, 49);
		contentPane.add(lblNumbersCovered);
		
		lblStars = new JLabel("Stars");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblStars.setBounds(31, 269, 144, 54);
		contentPane.add(lblStars);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(66, 185, 171, 41);
		contentPane.add(btnReset);
		
		JLabel lblLevel = new JLabel("Level 3");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(195, 29, 327, 82);
		contentPane.add(lblLevel);
		
		btnReturn = new JButton("Return to Main Menu");
		btnReturn.setBackground(Color.LIGHT_GRAY);
		btnReturn.setBounds(321, 185, 171, 41);
		contentPane.add(btnReturn);
		
		lblRedNums = new JLabel("RED: ");
		lblRedNums.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRedNums.setForeground(Color.RED);
		lblRedNums.setBounds(66, 394, 285, 23);
		contentPane.add(lblRedNums);
		
		lblBlueNums = new JLabel("BLUE: 1, 4, 6");
		lblBlueNums.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBlueNums.setForeground(Color.BLUE);
		lblBlueNums.setBounds(66, 419, 285, 23);
		contentPane.add(lblBlueNums);
		
		lblGreenNums = new JLabel("GREEN: 1, 2, 3, 4,  5, 6");
		lblGreenNums.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGreenNums.setForeground(Color.GREEN);
		lblGreenNums.setBounds(66, 444, 285, 23);
		contentPane.add(lblGreenNums);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(1350, 126, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnrotateCClockwise = new JButton("Rotate C. Clockwise");
		btnrotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnrotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnrotateCClockwise.setBounds(1350, 300, 125, 125);
		contentPane.add(btnrotateCClockwise);
		
		btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1350, 546, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1350, 721, 125, 125);
		contentPane.add(btnFlipHor);
	}

}
