import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class E_02_Davao_TravelGuide_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_02_Davao_TravelGuide_01 frame = new E_02_Davao_TravelGuide_01();
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
	public E_02_Davao_TravelGuide_01() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDavao = new JLabel("");
		lblDavao.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				int unitsToScroll = e.getUnitsToScroll();
				if (unitsToScroll > 0) { // Scrolled down
					E_02_Davao_TravelGuide_02 nextFrame = new E_02_Davao_TravelGuide_02();
					nextFrame.setVisible(true);
					dispose();
					
				}
			}
		});
		lblDavao.setIcon(new ImageIcon(E_02_Davao_TravelGuide_01.class.getResource("/imgs/Davao2.png")));
		lblDavao.setBounds(0, 0, 1366, 768);
		contentPane.add(lblDavao);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(E_02_Davao_TravelGuide_01.class.getResource("/imgs/Vid3_Davao.gif")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}