package Main;

import XMLManager.DecodificatoreXML;
import XMLManager.StrutturaDati;

public class Main {
	private static DecodificatoreXML dec=new DecodificatoreXML();
	public static void main(String[] args) {
		
		dec.leggiFile("C:\\Users\\dchia\\Documents\\_GitHub\\provaXMLMAnager\\codiciFiscali.xml");
		StrutturaDati nuovo0 = dec.getFile();
		dec.scriviFile(nuovo0, "bello", "utf-8", "1.0");
		dec.leggiFile("C:\\Users\\dchia\\Documents\\_GitHub\\provaXMLMAnager\\bello.xml");
		StrutturaDati nuovo1 = dec.getFile();
		if(dec.confronto(nuovo0, nuovo1)){
			System.out.println("Le due strutture dati sono uguali");
		}else {
			System.out.println("Le due strutture datu sono diverse");
		}
	}

}
