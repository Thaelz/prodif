package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.w3c.dom.Document;



import Views.VueGenererFacture;

public class ControllerBills {
		private VueGenererFacture vgf;
		private int cpt;
		
		public void save() throws FileNotFoundException, UnsupportedEncodingException {
			boolean ok = false;
			Date today = new Date();
			SimpleDateFormat mode = new SimpleDateFormat("dd-MM-yyyy");
			String maDate = mode.format(today);
			
			JFileChooser chooserSave = new JFileChooser();
			chooserSave.setApproveButtonText("Enregistrer");
			int returnVal = chooserSave.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
					try {
						PrintWriter writer = new PrintWriter(chooserSave.getSelectedFile().getPath(), "Unicode");
						writer.println("<HTML><HEAD><TITLE>Bill</TITLE></HEAD><BODY><table border='1' align='center'><tr><td><img src='http://img11.hostingpics.net/pics/845030iutbla.jpg' width='400'></td><td align='center'><b>Association PRODIF</b><br><b>D</b>éveloppement et <b>PRO</b>spectives des <b>D</b>épartements<br><b>I</b>nformatiques de <b>F</b>rance<br><i>Association loi 1901<br>N° SIRET: 500 368 154 000 18</i></td></tr><tr><td align='center'><b>Siège social :</b><br>Département informatique<br>IUT de Strasbourg Sud<br>72, route du Rhin<br>67 400 ILLKIRCH-GRAFFENSTADEN</td><td align='center'><b>Postal Address:</b><br>Association PRODIF - Computer Science department<br>IUT Blagnac<br>1 Place Georges Brassens<br>31700 Blagnac</td></tr></table>");
						writer.println("<p align='right'>Blagnac, "+maDate+"</p><h3 align='center'>Bill number "+maDate+"-"+this.cpt+"</h3>");
						writer.println("<table border='1' align='center'><tr><th>Label</th><th>Command Number</th><th>Amount</th></tr>");
						writer.println("<tr><td align='center'>"+this.vgf.getLabel()+"</td><td align='center'>"+this.vgf.getCN()+"</td><td align='center'>"+this.vgf.getAmount()+"</td></tr></table>");
						writer.println("<style type=\"text/css\" media=\"print\">.printbutton { visibility: hidden; display: none; }</style>");
						writer.println("<script>document.write(\"<input type='button' \" + \"onClick='window.print()' \" + \"class='printbutton' \" + \"value='Print This Page'/>\");</script></BODY></HTML>");
						writer.close();
						
						ok = true;
					} catch (NumberFormatException nfm) {
						ok = false;
					}
				}
				
			if(!ok) {
				JOptionPane.showMessageDialog(this.vgf, "Echec lors de la sauvegarde du fichier", "Erreur de sauvegarde", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public ControllerBills(VueGenererFacture _v, int _i) {
			this.vgf = _v;
			this.cpt = _i;
		}
		
		
}
