package boundary;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;

public class LightningLevelGui extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 1500, 1000);
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
		
		JLabel label_1 = new JLabel("0");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		label_1.setBounds(300, 333, 122, 49);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Stars");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		label_2.setBounds(10, 251, 144, 54);
		contentPane.add(label_2);
		
		JButton button = new JButton("Reset");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(45, 167, 171, 41);
		contentPane.add(button);
		
		JLabel lblLevel = new JLabel("Level 2");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(174, 11, 327, 82);
		contentPane.add(lblLevel);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBackground(Color.LIGHT_GRAY);
		btnReturnToMain.setBounds(300, 167, 171, 41);
		contentPane.add(btnReturnToMain);
		
		JPanel panel = new JPanel();
		panel.setBounds(620, 83, 720, 720);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Rotate Clockwise");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(1350, 83, 125, 125);
		contentPane.add(btnNewButton);
		
		JButton btnRotateCClockwise = new JButton("Rotate C. Clockwise");
		btnRotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateCClockwise.setBounds(1350, 257, 125, 125);
		contentPane.add(btnRotateCClockwise);
		
		JButton btnFlipVertically = new JButton("Flip Vertically");
		btnFlipVertically.setBackground(Color.LIGHT_GRAY);
		btnFlipVertically.setBounds(1350, 503, 125, 125);
		contentPane.add(btnFlipVertically);
		
		JButton btnFlipHorizontally = new JButton("Flip Horizontally");
		btnFlipHorizontally.setBackground(Color.LIGHT_GRAY);
		btnFlipHorizontally.setBounds(1350, 678, 125, 125);
		contentPane.add(btnFlipHorizontally);
	}

}
