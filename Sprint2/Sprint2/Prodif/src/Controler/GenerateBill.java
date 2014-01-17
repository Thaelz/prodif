package Controler;

import java.io.File;

import Views.VueGenererFacture;

public class GenerateBill {
	
	public GenerateBill(VueGenererFacture bill) {
		String cn = new String(bill.getCommandNumb());
		String amount = new String(bill.getAmount());
		String label = new String(bill.getLabel());
		
		File pdf = new File("Bill.pdf");
		
		System.out.println("Command number : "+cn);
		System.out.println("Amount : "+amount);
		System.out.println("Label : "+label);
	}
}