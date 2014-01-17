package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import Controller.ControllerBills;

public class ListenerGenerate implements ActionListener {
	private VueGenererFacture vgf;
	private int cpt;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ControllerBills controller = new ControllerBills(this.vgf, this.cpt);
		try {
			controller.save();
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public ListenerGenerate(VueGenererFacture _v, int i) {
		this.vgf = _v;
		this.cpt = i;
	}

}
