package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Controler.GenerateBill;

public class generateListener implements ActionListener {
	private VueGenererFacture fen;
	
	public generateListener(VueGenererFacture facture) {
		this.fen = facture;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		GenerateBill bill = new GenerateBill(this.fen);
		JOptionPane.showMessageDialog(null, "Bill generated");
	}
}
