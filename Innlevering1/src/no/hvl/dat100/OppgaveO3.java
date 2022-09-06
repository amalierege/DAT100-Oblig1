package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
		
	public static void main (String [] args) {
		
		// lese inn heltall for n (her kalt tall)
		
		String tallTxt	= showInputDialog ("Skriv inn et heltall større enn 0:");
		int tall = parseInt(tallTxt);
		
		do {
			
			if (tall <= 0) {
				
				String feilTxt = showInputDialog ("Jeg sa større enn 0, prøv igjen:");
				int feil = parseInt (feilTxt);
				tall = feil;
			}
			
		} while (tall <= 0);
		
		// beregne verdien til !n
		
		long sum = 1;
		
		for (int i = 1; i <= tall; i++) {
			
			sum *= i;
		}
		
		showMessageDialog (null, "Her er fakulteten av tallet ditt: " + sum + "!");
	}
}
