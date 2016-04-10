package boundary;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class SplashScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKabasuji = new JLabel("KABASUJI");
		lblKabasuji.setBackground(Color.WHITE);
		lblKabasuji.setHorizontalAlignment(SwingConstants.CENTER);
		lblKabasuji.setFont(new Font("MS Mincho", Font.PLAIN, 51));
		lblKabasuji.setBounds(41, 11, 344, 180);
		contentPane.add(lblKabasuji);
		
		JLabel lblCreatedByDrew = new JLabel("Created By: Drew, Nathan, Tes, Wyatt, and Brandon ");
		lblCreatedByDrew.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatedByDrew.setBounds(10, 202, 414, 14);
		contentPane.add(lblCreatedByDrew);
	}

}
