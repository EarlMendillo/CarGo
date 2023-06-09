// Manila Car 1

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class D_01_Manila_Cars_01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D_01_Manila_Cars_01 frame = new D_01_Manila_Cars_01();
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
	public D_01_Manila_Cars_01() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1056, 645, 200, 43);
		contentPane.add(lblNewLabel_1);

		JLabel lblManila = new JLabel("");
		lblManila.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				E_01_Manila_TravelGuide_01 HomeFrame = new E_01_Manila_TravelGuide_01();
				HomeFrame.setVisible(true);
				dispose();
			}

			public void mouseEntered(MouseEvent e) {
				// Add hover effect if desired
			}

			public void mouseExited(MouseEvent e) {
				// Remove hover effect if desired
			}
		});
		lblManila.setBounds(1232, 22, 134, 43);
		contentPane.add(lblManila);

		JLabel lblBGPic = new JLabel("");
		lblBGPic.setIcon(new ImageIcon(D_01_Manila_Cars_01.class.getResource("/imgs/D_01_Manila_Cars_01.png")));
		lblBGPic.setBounds(0, 0, 1366, 768);
		contentPane.add(lblBGPic);

	}
}