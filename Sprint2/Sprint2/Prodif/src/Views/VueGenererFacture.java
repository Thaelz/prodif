package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;

public class VueGenererFacture extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;



	/**
	 * Create the frame.
	 */
	public VueGenererFacture() {
		setBounds(100, 100, 643, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnGenerateBill = new JTextPane();
		txtpnGenerateBill.setForeground(new Color(60, 179, 113));
		txtpnGenerateBill.setFont(txtpnGenerateBill.getFont().deriveFont(txtpnGenerateBill.getFont().getStyle() | Font.BOLD, txtpnGenerateBill.getFont().getSize() + 2f));
		txtpnGenerateBill.setEditable(false);
		txtpnGenerateBill.setText("Generate Bill :");
		txtpnGenerateBill.setBounds(240, 11, 102, 20);
		contentPane.add(txtpnGenerateBill);
		
		textField = new JTextField();
		textField.setBounds(23, 56, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(23, 190, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(23, 256, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCommandNumber = new JLabel("Command number");
		lblCommandNumber.setFont(lblCommandNumber.getFont().deriveFont(lblCommandNumber.getFont().getStyle() | Font.BOLD, lblCommandNumber.getFont().getSize() + 1f));
		lblCommandNumber.setBounds(216, 59, 126, 14);
		contentPane.add(lblCommandNumber);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(23, 119, 156, 20);
		contentPane.add(comboBox);
		
		JLabel lblBillingAdress = new JLabel("Invoicing adress");
		lblBillingAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBillingAdress.setBounds(216, 122, 126, 14);
		contentPane.add(lblBillingAdress);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmount.setBounds(216, 193, 102, 14);
		contentPane.add(lblAmount);
		
		JLabel lblLabel = new JLabel("Label");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLabel.setBounds(216, 259, 46, 14);
		contentPane.add(lblLabel);
		
		JButton btnGenerateBill = new JButton("Generate bill");
		btnGenerateBill.setBounds(23, 326, 227, 72);
		contentPane.add(btnGenerateBill);
		btnGenerateBill.addActionListener(new generateListener(this));
		
		
		JButton btnViewPreviousBills = new JButton("View previous bills");
		btnViewPreviousBills.setBounds(287, 326, 227, 72);
		contentPane.add(btnViewPreviousBills);
		
		JLabel lblNoteGenerate = new JLabel("Note : Generate a bill will save it automaticly");
		lblNoteGenerate.setBounds(10, 404, 421, 25);
		contentPane.add(lblNoteGenerate);
	}
	
	public String getCommandNumb() {
		return this.textField.getText();
	}
	
	public String getAmount() {
		return this.textField_2.getText();
	}
	
	public String getLabel() {
		return this.textField_3.getText();
	}
	
	public VueGenererFacture getFen() {
		return this;
	}
}
