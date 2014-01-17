package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;

public class VueDetailFacture extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public VueDetailFacture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBillNumber = new JLabel("Bill number");
		lblBillNumber.setBounds(93, 10, 92, 14);
		contentPane.add(lblBillNumber);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(159, 10, 115, 14);
		contentPane.add(textPane);
		
		JLabel lblCommandNumber = new JLabel("Command number :");
		lblCommandNumber.setBounds(10, 52, 101, 14);
		contentPane.add(lblCommandNumber);
		
		JLabel lblAdress = new JLabel("Invoicing adress :");
		lblAdress.setBounds(10, 102, 101, 14);
		contentPane.add(lblAdress);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setBounds(10, 150, 85, 14);
		contentPane.add(lblAmount);
		
		JLabel lblLabel = new JLabel("Label :");
		lblLabel.setBounds(10, 199, 77, 14);
		contentPane.add(lblLabel);
		
		JList list = new JList();
		list.setBounds(43, 248, 427, 197);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Products");
		lblNewLabel.setBounds(228, 228, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(215, 458, 89, 23);
		contentPane.add(btnExit);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(105, 52, 101, 14);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(105, 102, 101, 14);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(105, 150, 101, 14);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(105, 199, 103, 14);
		contentPane.add(textPane_4);
	}
}
