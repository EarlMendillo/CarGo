import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class E_01_Manila_TravelGuide_07 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_01_Manila_TravelGuide_07 frame = new E_01_Manila_TravelGuide_07();
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
	public E_01_Manila_TravelGuide_07() {
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
					E_01_Manila_TravelGuide_06 backFrame = new E_01_Manila_TravelGuide_06();
                    backFrame.setVisible(true);
                    dispose();
                } else if (e.getWheelRotation() > 0) {  // Scrolling down
                	E_01_Manila_TravelGuide_08 nextFrame = new E_01_Manila_TravelGuide_08();
                    nextFrame.setVisible(true);
                    dispose();
                
                }
				
			}
		});
		
		lblBGPic.setIcon(new ImageIcon(E_01_Manila_TravelGuide_07.class.getResource("/imgs/E_01_Manila_TravelGuide_07.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);
	}

}
