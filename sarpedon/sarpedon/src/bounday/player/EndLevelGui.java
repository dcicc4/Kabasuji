package bounday.player;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.player.SwitchWindowController;
import entity.player.SarpedonKabasuji;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class EndLevelGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public EndLevelGui(SarpedonKabasuji game, JFrame levelGui) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Congratulations! ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 53));
		lblNewLabel.setBounds(10, 11, 414, 111);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You Won!");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 133, 414, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back to Level Select");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(134, 208, 161, 42);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new SwitchWindowController(this, levelGui, new LevelSelectGui(game)));
	}
}
