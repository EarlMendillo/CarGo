import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class D_03_Cebu_Cars_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D_03_Cebu_Cars_01 frame = new D_03_Cebu_Cars_01();
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
	public D_03_Cebu_Cars_01() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcebu = new JLabel("");
		lblcebu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_01 next = new E_03_Cebu_TravelGuide_01();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblcebu.setBounds(1229, 21, 137, 41);
		contentPane.add(lblcebu);

		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(D_03_Cebu_Cars_01.class.getResource("/imgs/D_03_Cebu_Cars_01.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}