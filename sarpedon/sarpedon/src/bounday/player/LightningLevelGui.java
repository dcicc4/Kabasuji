package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boundary.builder.BuilderBoardPanel;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;

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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightningLevelGui frame = new LightningLevelGui();
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
	public LightningLevelGui() {
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
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollPane.setColumnHeaderView(scrollBar);
		
		JLabel lblTimeLeft = new JLabel("Time Left:");
		lblTimeLeft.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblTimeLeft.setBounds(10, 333, 271, 49);
		contentPane.add(lblTimeLeft);
		
		lblTime = new JLabel("0");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblTime.setBounds(300, 333, 122, 49);
		contentPane.add(lblTime);
		
		lblStars = new JLabel("Stars");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblStars.setBounds(10, 251, 144, 54);
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
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
		panel.setBounds(620, 83, 720, 720);
		contentPane.add(panel);
		
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
	}

}
