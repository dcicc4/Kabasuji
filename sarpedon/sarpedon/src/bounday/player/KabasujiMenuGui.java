package bounday.player;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class KabasujiMenuGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KabasujiMenuGui frame = new KabasujiMenuGui();
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
	public KabasujiMenuGui() {
		setTitle("Kabasuji");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBackground(Color.YELLOW);
		btnNewGame.setForeground(Color.RED);
		btnNewGame.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewGame.setBounds(561, 287, 304, 110);
		contentPane.add(btnNewGame);
		
		JButton btnLevelSelect = new JButton("Level Select");
		btnLevelSelect.setBackground(Color.GREEN);
		btnLevelSelect.setForeground(Color.BLUE);
		btnLevelSelect.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnLevelSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLevelSelect.setBounds(561, 534, 304, 82);
		contentPane.add(btnLevelSelect);
		
		JLabel lblKabasuji = new JLabel("Kabasuji");
		lblKabasuji.setFont(new Font("Tahoma", Font.PLAIN, 72));
		lblKabasuji.setBounds(575, 28, 492, 159);
		contentPane.add(lblKabasuji);
	}

}
