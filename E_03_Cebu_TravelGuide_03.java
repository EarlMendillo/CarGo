import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class E_03_Cebu_TravelGuide_03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_03_Cebu_TravelGuide_03 frame = new E_03_Cebu_TravelGuide_03();
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
	public E_03_Cebu_TravelGuide_03() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				int unitsToScroll = e.getUnitsToScroll();
				if (unitsToScroll > 0) { // Scrolled down
					E_03_Cebu_TravelGuide_04 nextFrame = new E_03_Cebu_TravelGuide_04();
					nextFrame.setVisible(true);
					dispose();
				}
			}
		});
		
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_01 back = new E_03_Cebu_TravelGuide_01();
				back.setVisible(true);
				dispose();
				
			}
		});
		lblBack.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_03.class.getResource("/imgs/Z_TravelGuide_Back.png")));
		lblBack.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBack);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_03.class.getResource("/imgs/E_03_Cebu_TravelGuide_03.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
