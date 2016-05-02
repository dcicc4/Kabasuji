package boundary.builder;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;

/**
 * This is the splash screen that comes up when you load the uilder or player.
 * @author Nathan
 *
 */
public class BuilderSplashScreen extends JFrame{

	JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderSplashScreen frame = new BuilderSplashScreen();
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
	public BuilderSplashScreen() {
		setEnabled(false);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(600, 400, 450, 300);
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
		lblCreatedByDrew.setBounds(10, 189, 414, 14);
		contentPane.add(lblCreatedByDrew);
	}


}
