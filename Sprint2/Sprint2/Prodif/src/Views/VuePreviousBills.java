package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VuePreviousBills extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VuePreviousBills() {
		setTitle("Previous bills");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 626, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(58, 56, 484, 258);
		contentPane.add(list);
		
		JLabel lblSelectAnItem = new JLabel("Select an item then click \"OK\" to see more details");
		lblSelectAnItem.setBounds(53, 11, 240, 34);
		contentPane.add(lblSelectAnItem);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(264, 325, 114, 42);
		contentPane.add(btnNewButton);
	}
}
