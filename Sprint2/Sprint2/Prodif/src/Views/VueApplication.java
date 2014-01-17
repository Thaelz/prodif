package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class VueApplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public VueApplication() {
		setTitle("Prodif 14 program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGenererFacture = new JButton("Generate bill");
		btnGenererFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueGenererFacture vGF = new VueGenererFacture();
				vGF.setVisible(true);
			}
		});
		btnGenererFacture.setBounds(10, 127, 173, 28);
		contentPane.add(btnGenererFacture);
		
		JButton btnVoir = new JButton("See previous bills");
		btnVoir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VuePreviousBills vPB = new VuePreviousBills();
				vPB.setVisible(true);
			}
		});
		btnVoir.setBounds(244, 127, 180, 28);
		contentPane.add(btnVoir);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 442, 28);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i;
				i = JOptionPane.showConfirmDialog(new VueApplication(),"Are you sure you want to quit ?");
				
				if(i==0){ // 
				System.exit(0);
				}
			}
		});
		mnOptions.add(mntmExit);
		
		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			VueAbout vA = new VueAbout();
			vA.setVisible(true);
			}
		});
		mnAbout.add(mntmAbout);
		
		JLabel lblWelcomeToProdif = new JLabel("Welcome to prodif 14's Program");
		lblWelcomeToProdif.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomeToProdif.setBounds(116, 39, 219, 28);
		contentPane.add(lblWelcomeToProdif);
		

		

	}
}
