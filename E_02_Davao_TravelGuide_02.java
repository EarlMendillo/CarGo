import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class E_02_Davao_TravelGuide_02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_02_Davao_TravelGuide_02 frame = new E_02_Davao_TravelGuide_02();
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
	public E_02_Davao_TravelGuide_02() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LblDavao1 = new JLabel("");
		LblDavao1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_03 next = new E_02_Davao_TravelGuide_03();
				next.setVisible(true);
				dispose();
				
			}
		});
		LblDavao1.setBounds(72, 221, 296, 461);
		contentPane.add(LblDavao1);
		
		JLabel LblDavao2 = new JLabel("");
		LblDavao2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_06 next = new E_02_Davao_TravelGuide_06();
				next.setVisible(true);
				dispose();
				
			}
		});
		LblDavao2.setBounds(378, 221, 296, 461);
		contentPane.add(LblDavao2);
		
		JLabel LblDavao3 = new JLabel("");
		LblDavao3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_09 next = new E_02_Davao_TravelGuide_09();
				next.setVisible(true);
				dispose();
				
			}
		});
		LblDavao3.setBounds(685, 221, 296, 461);
		contentPane.add(LblDavao3);
		
		JLabel LblDavao4 = new JLabel("");
		LblDavao4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_12 next = new E_02_Davao_TravelGuide_12();
				next.setVisible(true);
				dispose();
				
			}
		});
		LblDavao4.setBounds(991, 221, 296, 461);
		contentPane.add(LblDavao4);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				if (e.getWheelRotation() < 0) {  // Scrolling up
					E_02_Davao_TravelGuide_01 backFrame = new E_02_Davao_TravelGuide_01();
                    backFrame.setVisible(true);
                    dispose();
				
				}
			}
		});
		lblBGPic.setIcon(new ImageIcon(E_02_Davao_TravelGuide_02.class.getResource("/imgs/E_02_Davao_TravelGuide_02.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
