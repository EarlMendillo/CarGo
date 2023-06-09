import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class E_03_Cebu_TravelGuide_02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_03_Cebu_TravelGuide_02 frame = new E_03_Cebu_TravelGuide_02();
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
	public E_03_Cebu_TravelGuide_02() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCebu1 = new JLabel("");
		lblCebu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_03 next = new E_03_Cebu_TravelGuide_03();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblCebu1.setBounds(72, 226, 298, 459);
		contentPane.add(lblCebu1);
		
		JLabel lblCebu1_1 = new JLabel("");
		lblCebu1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_06 next = new E_03_Cebu_TravelGuide_06();
				next.setVisible(true);
				dispose();
				
				
			}
		});
		lblCebu1_1.setBounds(380, 226, 298, 459);
		contentPane.add(lblCebu1_1);
		
		JLabel lblCebu1_1_1 = new JLabel("");
		lblCebu1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_09 next = new E_03_Cebu_TravelGuide_09();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblCebu1_1_1.setBounds(688, 226, 298, 459);
		contentPane.add(lblCebu1_1_1);
		
		JLabel lblCebu1_1_1_1 = new JLabel("");
		lblCebu1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_03_Cebu_TravelGuide_12 next = new E_03_Cebu_TravelGuide_12();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblCebu1_1_1_1.setBounds(996, 226, 298, 459);
		contentPane.add(lblCebu1_1_1_1);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				if (e.getWheelRotation() < 0) {  // Scrolling up
					E_03_Cebu_TravelGuide_01 backFrame = new E_03_Cebu_TravelGuide_01();
                    backFrame.setVisible(true);
                    dispose();
				
				}
			}
		});
		lblBGPic.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_02.class.getResource("/imgs/E_03_Cebu_TravelGuide_02.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}