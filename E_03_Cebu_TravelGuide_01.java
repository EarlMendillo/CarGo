import java.awt.EventQueue;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class E_03_Cebu_TravelGuide_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_03_Cebu_TravelGuide_01 frame = new E_03_Cebu_TravelGuide_01();
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
	public E_03_Cebu_TravelGuide_01() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCebu = new JLabel("");
		lblCebu.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				int unitsToScroll = e.getUnitsToScroll();
				if (unitsToScroll > 0) { // Scrolled down
					E_03_Cebu_TravelGuide_02 nextFrame = new E_03_Cebu_TravelGuide_02();
					nextFrame.setVisible(true);
					dispose();
					
				}
			}
		});
		lblCebu.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_01.class.getResource("/imgs/Cebu2.png")));
		lblCebu.setBounds(0, 0, 1366, 768);
		contentPane.add(lblCebu);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_01.class.getResource("/imgs/Vid3-Cebu.gif")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}