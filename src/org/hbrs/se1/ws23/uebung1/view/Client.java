package org.hbrs.se1.ws23.uebung1.view;

import org.hbrs.se1.ws23.uebung1.control.Factory;
import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;

public class Client {

	//GermanTranslator GT;

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!

			 GermanTranslator GT = (GermanTranslator) Factory.createTranslator();
			 String erg = GT.translateNumber(aNumber);

			System.out.println("Das Ergebnis der Berechnung: " + erg); //"[das Ergebnis an dieser Stelle]"  );

		 }
}





