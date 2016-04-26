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
	JButton btnLevel1;
	 JButton btnLevel2;
	JButton btnLevel3;
	JButton btnLevel4;
	JButton btnLevel5;
	JButton btnLevel6;
	JButton btnLevel7;
	JButton btnLevel8;
	JButton btnLevel9;
	JButton btnLevel10;
	JButton btnLevel11;
	JButton btnLevel12;
	JButton btnLevel13;
	JButton btnLevel14;
	JButton btnLevel15;
	

	public JButton[] getButtons(){
		return new JButton[]{btnLevel1, btnLevel2, btnLevel3, btnLevel4, btnLevel5, btnLevel6, btnLevel7, 
				btnLevel8, btnLevel9, btnLevel10, btnLevel11, btnLevel12, btnLevel13, btnLevel14, btnLevel15, };
	}

	/**
	 * Create the frame.
	 */
	public LevelSelectGui() {
		setTitle("Level Select");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLevel1 = new JButton("Level 1");
		btnLevel1.setBackground(Color.LIGHT_GRAY);
		btnLevel1.setBounds(26, 359, 250, 120);
		contentPane.add(btnLevel1);
		
		btnLevel2 = new JButton("Level 2");
		btnLevel2.setEnabled(true);
		btnLevel2.setBackground(Color.LIGHT_GRAY);
		btnLevel2.setBounds(26, 541, 250, 120);
		contentPane.add(btnLevel2);
		
		btnLevel3 = new JButton("Level 3");
		btnLevel3.setEnabled(false);
		btnLevel3.setBackground(Color.LIGHT_GRAY);
		btnLevel3.setBounds(26, 722, 250, 120);
		contentPane.add(btnLevel3);
		
		btnLevel4 = new JButton("Level 4");
		btnLevel4.setEnabled(false);
		btnLevel4.setBackground(Color.LIGHT_GRAY);
		btnLevel4.setBounds(327, 359, 250, 120);
		contentPane.add(btnLevel4);
		
		btnLevel5 = new JButton("Level 5");
		btnLevel5.setEnabled(false);
		btnLevel5.setBackground(Color.LIGHT_GRAY);
		btnLevel5.setForeground(Color.BLACK);
		btnLevel5.setBounds(333, 541, 250, 120);
		contentPane.add(btnLevel5);
		
		btnLevel6 = new JButton("Level 6");
		btnLevel6.setEnabled(false);
		btnLevel6.setBackground(Color.LIGHT_GRAY);
		btnLevel6.setForeground(Color.BLACK);
		btnLevel6.setBounds(333, 722, 250, 120);
		contentPane.add(btnLevel6);
		
		btnLevel7 = new JButton("Level 7");
		btnLevel7.setEnabled(false);
		btnLevel7.setBackground(Color.LIGHT_GRAY);
		btnLevel7.setForeground(Color.BLACK);
		btnLevel7.setBounds(637, 359, 250, 120);
		contentPane.add(btnLevel7);
		
		btnLevel8 = new JButton("Level 8");
		btnLevel8.setEnabled(false);
		btnLevel8.setBackground(Color.LIGHT_GRAY);
		btnLevel8.setForeground(Color.BLACK);
		btnLevel8.setBounds(637, 541, 250, 120);
		contentPane.add(btnLevel8);
		
		btnLevel9 = new JButton("Level 9");
		btnLevel9.setEnabled(false);
		btnLevel9.setBackground(Color.LIGHT_GRAY);
		btnLevel9.setForeground(Color.BLACK);
		btnLevel9.setBounds(637, 722, 250, 120);
		contentPane.add(btnLevel9);
		
		btnLevel10 = new JButton("Level 10");
		btnLevel10.setEnabled(false);
		btnLevel10.setBackground(Color.LIGHT_GRAY);
		btnLevel10.setForeground(Color.BLACK);
		btnLevel10.setBounds(923, 359, 250, 120);
		contentPane.add(btnLevel10);
		
		btnLevel11 = new JButton("Level 11");
		btnLevel11.setEnabled(false);
		btnLevel11.setBackground(Color.LIGHT_GRAY);
		btnLevel11.setForeground(Color.BLACK);
		btnLevel11.setBounds(923, 541, 250, 120);
		contentPane.add(btnLevel11);
		
		btnLevel12 = new JButton("Level 12");
		btnLevel12.setEnabled(false);
		btnLevel12.setBackground(Color.LIGHT_GRAY);
		btnLevel12.setForeground(Color.BLACK);
		btnLevel12.setBounds(923, 722, 250, 120);
		contentPane.add(btnLevel12);
		
		btnLevel13 = new JButton("Level 14");
		btnLevel13.setEnabled(false);
		btnLevel13.setBackground(Color.LIGHT_GRAY);
		btnLevel13.setForeground(Color.BLACK);
		btnLevel13.setBounds(1210, 541, 250, 120);
		contentPane.add(btnLevel13);
		
		btnLevel14 = new JButton("Level 13");
		btnLevel14.setEnabled(false);
		btnLevel14.setBackground(Color.LIGHT_GRAY);
		btnLevel14.setForeground(Color.BLACK);
		btnLevel14.setBounds(1210, 359, 250, 120);
		contentPane.add(btnLevel14);
		
		btnLevel15 = new JButton("Level 15");
		btnLevel15.setEnabled(false);
		btnLevel15.setBackground(Color.LIGHT_GRAY);
		btnLevel15.setForeground(Color.BLACK);
		btnLevel15.setBounds(1210, 722, 250, 120);
		contentPane.add(btnLevel15);
		
		JLabel lblSelectALevel = new JLabel("Select a Level");
		lblSelectALevel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblSelectALevel.setBounds(531, 64, 636, 168);
		contentPane.add(lblSelectALevel);
	}
}
