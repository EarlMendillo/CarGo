import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class E_02_Davao_TravelGuide_08 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_02_Davao_TravelGuide_08 frame = new E_02_Davao_TravelGuide_08();
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
	public E_02_Davao_TravelGuide_08() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBGPic = new JLabel("");
		lblBGPic.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				if (e.getWheelRotation() < 0) {  // Scrolling up
					E_02_Davao_TravelGuide_07 backFrame = new E_02_Davao_TravelGuide_07();
                    backFrame.setVisible(true);
                    dispose();
                    
				}   
			}
		});
		lblBGPic.setIcon(new ImageIcon(E_02_Davao_TravelGuide_08.class.getResource("/imgs/E_02_Davao_TravelGuide_08.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
