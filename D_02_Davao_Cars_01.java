import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class D_02_Davao_Cars_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D_02_Davao_Cars_01 frame = new D_02_Davao_Cars_01();
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
	public D_02_Davao_Cars_01() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldavao = new JLabel("");
		lbldavao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				E_02_Davao_TravelGuide_01 next = new E_02_Davao_TravelGuide_01();
				next.setVisible(true);
				dispose();
				
			}
		});
		lbldavao.setBounds(1227, 11, 139, 61);
		contentPane.add(lbldavao);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(D_02_Davao_Cars_01.class.getResource("/imgs/D_02_Davao_Cars_01.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
