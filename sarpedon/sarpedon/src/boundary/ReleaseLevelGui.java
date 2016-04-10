package boundary;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class ReleaseLevelGui extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BoardPanel panel = new BoardPanel();
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
		
		JLabel label_2 = new JLabel("Stars");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		label_2.setBounds(31, 269, 144, 54);
		contentPane.add(label_2);
		
		JButton button = new JButton("Reset");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(66, 185, 171, 41);
		contentPane.add(button);
		
		JLabel lblLevel = new JLabel("Level 3");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLevel.setBounds(195, 29, 327, 82);
		contentPane.add(lblLevel);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBackground(Color.LIGHT_GRAY);
		btnReturnToMain.setBounds(321, 185, 171, 41);
		contentPane.add(btnReturnToMain);
		
		JLabel lblRed = new JLabel("RED: ");
		lblRed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRed.setForeground(Color.RED);
		lblRed.setBounds(66, 394, 285, 23);
		contentPane.add(lblRed);
		
		JLabel lblBlue = new JLabel("BLUE: 1, 4, 6");
		lblBlue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBlue.setForeground(Color.BLUE);
		lblBlue.setBounds(66, 419, 285, 23);
		contentPane.add(lblBlue);
		
		JLabel lblGreen = new JLabel("GREEN: 1, 2, 3, 4,  5, 6");
		lblGreen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGreen.setForeground(Color.GREEN);
		lblGreen.setBounds(66, 444, 285, 23);
		contentPane.add(lblGreen);
		
		JButton button_2 = new JButton("Rotate Clockwise");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(1350, 126, 125, 125);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Rotate C. Clockwise");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(1350, 300, 125, 125);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Flip Vertically");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(1350, 546, 125, 125);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Flip Horizontally");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(1350, 721, 125, 125);
		contentPane.add(button_5);
	}

}
