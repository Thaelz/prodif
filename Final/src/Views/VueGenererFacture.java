package Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;

import Controller.ControllerBills;

public class VueGenererFacture extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox<String> comboBox;
	private int cpt = 0;



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
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(23, 119, 156, 20);
		comboBox.setEditable(true);
		contentPane.add(comboBox);
		
		JLabel lblBillingAdress = new JLabel("Invoicing address");
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
		btnGenerateBill.addActionListener(new ListenerGenerate(this, this.cpt));
		this.cpt++;
		
		JButton btnViewPreviousBills = new JButton("View previous bills");
		btnViewPreviousBills.setBounds(287, 326, 227, 72);
		contentPane.add(btnViewPreviousBills);
		btnViewPreviousBills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VuePreviousBills vPB = new VuePreviousBills();
				vPB.setVisible(true);
			}
		});
		JLabel lblNoteGenerate = new JLabel("Note : Generate a bill will save it automaticly after you agreed the keying ");
		lblNoteGenerate.setBounds(10, 404, 421, 25);
		contentPane.add(lblNoteGenerate);
	}
	
	public int getCN() {
		return Integer.parseInt(this.textField.getText());
	}
	
	public String getAddress() {
		return this.comboBox.getSelectedItem().toString();
	}
	
	public int getAmount() {
		return Integer.parseInt(this.textField_2.getText());
	}
	
	public String getLabel() {
		return this.textField_3.getText();
	}
}
