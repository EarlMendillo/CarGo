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

public class E_02_Davao_TravelGuide_12 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_02_Davao_TravelGuide_12 frame = new E_02_Davao_TravelGuide_12();
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
	public E_02_Davao_TravelGuide_12() {
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
					E_02_Davao_TravelGuide_13 nextFrame = new E_02_Davao_TravelGuide_13();
					nextFrame.setVisible(true);
					dispose();
				}
			}
		});
		
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_01 back = new E_02_Davao_TravelGuide_01();
				back.setVisible(true);
				dispose();
				
			}
		});
		lblBack.setIcon(new ImageIcon(E_02_Davao_TravelGuide_12.class.getResource("/imgs/Z_TravelGuide_Back.png")));
		lblBack.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBack);
		
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(E_02_Davao_TravelGuide_12.class.getResource("/imgs/E_02_Davao_TravelGuide_12.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
