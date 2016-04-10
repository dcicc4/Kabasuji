package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class LevelSelectGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelSelectGui frame = new LevelSelectGui();
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
	public LevelSelectGui() {
		setTitle("Level Select");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLevel = new JButton("Level 1");
		btnLevel.setBackground(Color.LIGHT_GRAY);
		btnLevel.setBounds(26, 359, 250, 120);
		contentPane.add(btnLevel);
		
		JButton btnLevel_1 = new JButton("Level 2");
		btnLevel_1.setBackground(Color.LIGHT_GRAY);
		btnLevel_1.setBounds(26, 541, 250, 120);
		contentPane.add(btnLevel_1);
		
		JButton btnLevel_2 = new JButton("Level 3");
		btnLevel_2.setBackground(Color.LIGHT_GRAY);
		btnLevel_2.setBounds(26, 722, 250, 120);
		contentPane.add(btnLevel_2);
		
		JButton btnLevel_3 = new JButton("Level 4");
		btnLevel_3.setBackground(Color.LIGHT_GRAY);
		btnLevel_3.setBounds(327, 359, 250, 120);
		contentPane.add(btnLevel_3);
		
		JButton btnLevel_4 = new JButton("Level 5");
		btnLevel_4.setBackground(Color.DARK_GRAY);
		btnLevel_4.setForeground(Color.WHITE);
		btnLevel_4.setBounds(333, 541, 250, 120);
		contentPane.add(btnLevel_4);
		
		JButton btnLevel_5 = new JButton("Level 6");
		btnLevel_5.setBackground(Color.DARK_GRAY);
		btnLevel_5.setForeground(Color.WHITE);
		btnLevel_5.setBounds(333, 722, 250, 120);
		contentPane.add(btnLevel_5);
		
		JButton btnLevel_6 = new JButton("Level 7");
		btnLevel_6.setBackground(Color.DARK_GRAY);
		btnLevel_6.setForeground(Color.WHITE);
		btnLevel_6.setBounds(637, 359, 250, 120);
		contentPane.add(btnLevel_6);
		
		JButton btnLevel_7 = new JButton("Level 8");
		btnLevel_7.setBackground(Color.DARK_GRAY);
		btnLevel_7.setForeground(Color.WHITE);
		btnLevel_7.setBounds(637, 541, 250, 120);
		contentPane.add(btnLevel_7);
		
		JButton btnLevel_8 = new JButton("Level 9");
		btnLevel_8.setBackground(Color.DARK_GRAY);
		btnLevel_8.setForeground(Color.WHITE);
		btnLevel_8.setBounds(637, 722, 250, 120);
		contentPane.add(btnLevel_8);
		
		JButton btnLevel_9 = new JButton("Level 10");
		btnLevel_9.setBackground(Color.DARK_GRAY);
		btnLevel_9.setForeground(Color.WHITE);
		btnLevel_9.setBounds(923, 359, 250, 120);
		contentPane.add(btnLevel_9);
		
		JButton btnLevel_10 = new JButton("Level 11");
		btnLevel_10.setBackground(Color.DARK_GRAY);
		btnLevel_10.setForeground(Color.WHITE);
		btnLevel_10.setBounds(923, 541, 250, 120);
		contentPane.add(btnLevel_10);
		
		JButton btnLevel_11 = new JButton("Level 12");
		btnLevel_11.setBackground(Color.DARK_GRAY);
		btnLevel_11.setForeground(Color.WHITE);
		btnLevel_11.setBounds(923, 722, 250, 120);
		contentPane.add(btnLevel_11);
		
		JButton btnLevel_12 = new JButton("Level 14");
		btnLevel_12.setBackground(Color.DARK_GRAY);
		btnLevel_12.setForeground(Color.WHITE);
		btnLevel_12.setBounds(1210, 541, 250, 120);
		contentPane.add(btnLevel_12);
		
		JButton btnLevel_13 = new JButton("Level 13");
		btnLevel_13.setBackground(Color.DARK_GRAY);
		btnLevel_13.setForeground(Color.WHITE);
		btnLevel_13.setBounds(1210, 359, 250, 120);
		contentPane.add(btnLevel_13);
		
		JButton btnLevel_14 = new JButton("Level 15");
		btnLevel_14.setBackground(Color.DARK_GRAY);
		btnLevel_14.setForeground(Color.WHITE);
		btnLevel_14.setBounds(1210, 722, 250, 120);
		contentPane.add(btnLevel_14);
		
		JLabel lblSelectALevel = new JLabel("Select a Level");
		lblSelectALevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblSelectALevel.setBounds(531, 64, 636, 168);
		contentPane.add(lblSelectALevel);
	}
}
