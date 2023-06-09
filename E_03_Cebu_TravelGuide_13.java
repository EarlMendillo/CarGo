import java.awt.EventQueue;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class E_03_Cebu_TravelGuide_13 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_03_Cebu_TravelGuide_13 frame = new E_03_Cebu_TravelGuide_13();
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
	public E_03_Cebu_TravelGuide_13() {
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
					E_03_Cebu_TravelGuide_12 backFrame = new E_03_Cebu_TravelGuide_12();
                    backFrame.setVisible(true);
                    dispose();
                } else if (e.getWheelRotation() > 0) {  // Scrolling down
                	E_03_Cebu_TravelGuide_14 nextFrame = new E_03_Cebu_TravelGuide_14();
                    nextFrame.setVisible(true);
                    dispose();
                
                }
			}
		});
		lblBGPic.setIcon(new ImageIcon(E_03_Cebu_TravelGuide_13.class.getResource("/imgs/E_03_Cebu_TravelGuide_13.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}

