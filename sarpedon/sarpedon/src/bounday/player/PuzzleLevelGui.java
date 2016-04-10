package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import boundary.builder.BoardPanel;

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
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BoardPanel panel = new BoardPanel();
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
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel_1.setBounds(316, 350, 122, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblStars = new JLabel("Stars");
		lblStars.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblStars.setBounds(26, 268, 144, 54);
		contentPane.add(lblStars);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(61, 184, 171, 41);
		contentPane.add(btnReset);
		
		JLabel lblLevel = new JLabel("Level 1");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(190, 28, 327, 82);
		contentPane.add(lblLevel);
		
		JButton btnHint = new JButton("Return to Main Menu");
		btnHint.setBackground(Color.LIGHT_GRAY);
		btnHint.setBounds(316, 184, 171, 41);
		contentPane.add(btnHint);
		
		JButton button = new JButton("Rotate Clockwise");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1349, 123, 125, 125);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Flip Horizontally");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(1349, 718, 125, 125);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Flip Vertically");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(1349, 543, 125, 125);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Rotate C. Clockwise");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(1349, 297, 125, 125);
		contentPane.add(button_3);
	}
}
