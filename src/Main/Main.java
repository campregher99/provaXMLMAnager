package Main;

import XMLManager.DecodificatoreXML;
import XMLManager.StrutturaDati;

public class Main {
	private static DecodificatoreXML dec=new DecodificatoreXML();
	public static void main(String[] args) {
		
		dec.leggiFile("C:\\Users\\dchia\\Documents\\_GitHub\\provaXMLMAnager\\PgAr_Map_5.xml");
		StrutturaDati nuovo0 = dec.getFile();
		dec.scriviFile(nuovo0, "bello", "utf-8", "1.0");
	}

}
