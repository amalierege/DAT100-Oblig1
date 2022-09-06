package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB5 {
	
	public static void main (String [] args) {
		
		int elevNr = 0;
		
		for (int i = 1; i <= 10; i++) {
		
			elevNr++;
			
			boolean riktigPoengsum;
			
			do {
			
				riktigPoengsum = true;
				
				String poengsumTxt = showInputDialog ("Elev nr " + elevNr + " sin poengsum: ");
				int poengsum = parseInt (poengsumTxt);
				
				String karakter = "";
				String resultat = "Elev nr " + elevNr + " sin karakter er: ";
				
				if (poengsum <= 100 && poengsum >= 90) {
					karakter = "A";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else if (poengsum <= 89 && poengsum >= 80) {
					karakter = "B";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else if (poengsum <= 79 && poengsum >= 60) {
					karakter = "C";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else if (poengsum <= 59 && poengsum >= 50) {
					karakter = "D";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else if (poengsum <= 49 && poengsum >= 40) {
					karakter = "E";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else if (poengsum <= 39 && poengsum >= 0) {
					karakter = "F";
					showMessageDialog (null, resultat + "\n" + karakter);
					
				} else {
					
					riktigPoengsum = false;
					
					String feilmelding = "Ugyldig. Oppgi en gyldig poengsumverdi mellom 0-100.";
					showMessageDialog (null, feilmelding);
				}
				
			} while (!riktigPoengsum);
		} 
	}
}
