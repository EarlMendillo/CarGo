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

public class E_01_Manila_TravelGuide_02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_01_Manila_TravelGuide_02 frame = new E_01_Manila_TravelGuide_02();
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
	public E_01_Manila_TravelGuide_02() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManila1 = new JLabel("");
		lblManila1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_01_Manila_TravelGuide_03 next = new E_01_Manila_TravelGuide_03();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblManila1.setBounds(70, 220, 305, 465);
		contentPane.add(lblManila1);
		
		JLabel lblManila2 = new JLabel("");
		lblManila2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_01_Manila_TravelGuide_06 next = new E_01_Manila_TravelGuide_06();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblManila2.setBounds(385, 220, 305, 465);
		contentPane.add(lblManila2);
		
		JLabel lblManila3 = new JLabel("");
		lblManila3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_01_Manila_TravelGuide_09 next = new E_01_Manila_TravelGuide_09();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblManila3.setBounds(684, 220, 305, 465);
		contentPane.add(lblManila3);
		
		JLabel lblManila4 = new JLabel("");
		lblManila4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_01_Manila_TravelGuide_12 next = new E_01_Manila_TravelGuide_12();
				next.setVisible(true);
				dispose();
				
			}
		});
		lblManila4.setBounds(999, 220, 305, 465);
		contentPane.add(lblManila4);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				if (e.getWheelRotation() < 0) {  // Scrolling up
                    E_01_Manila_TravelGuide_01 backFrame = new E_01_Manila_TravelGuide_01();
                    backFrame.setVisible(true);
                    dispose();
                }
				
			}
		});
		lblBGPic.setIcon(new ImageIcon(E_01_Manila_TravelGuide_02.class.getResource("/imgs/E_01_Manila_TravelGuide_02 (1).png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}
}