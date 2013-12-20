package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;

public class VueAbout extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VueAbout() {
		setTitle("About");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProdifIsAn = new JLabel("Prodif is an application designed by ingenious students from IUT de Blagnac.");
		lblProdifIsAn.setBounds(10, 11, 414, 240);
		contentPane.add(lblProdifIsAn);
	}

}
