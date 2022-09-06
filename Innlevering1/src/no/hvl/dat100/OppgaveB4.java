package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class OppgaveB4 {
	
	public static void main (String [] args) {
		
		// lese inn bruttoinntekt
		
		String bruttoTxt = showInputDialog ("Skriv inn bruttoinntekt: ");
		double brutto = parseDouble(bruttoTxt);
		
		double sats = 0.0;
	
		// beregner skattesatser
		
		if (brutto <= 190349) {
			
			sats = 0.0;
		
		} else if (brutto >= 190350 && brutto <= 267899) {
			
			sats = 1.7;

		} else if (brutto >= 267900 && brutto <= 643799){
			
			sats = 4.0;

		} else if (brutto >= 643800 && brutto <= 969199) {
			
			sats = 13.4;

		} else if (brutto >= 969200 && brutto <= 1999999) {
			
			sats = 16.4;
			
		} else if (brutto >= 2000000) {
			
			sats = 17.4;
		}
		
		double utregning = (brutto * (sats/100) );
		
		// skriver ut trinnskatten
		
		String trinnskatt = String.format ("%.2f", utregning);
		String utMelding = "Din beregnede trinnskatt er: \n" + trinnskatt + "kr.";
		
		showMessageDialog (null, utMelding);
	}
}
