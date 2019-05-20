package Main;

import XMLManager.DecodificatoreXML;
import XMLManager.StrutturaDati;

public class Main {
	private static DecodificatoreXML dec=new DecodificatoreXML();
	public static void main(String[] args) {
		
		dec.leggiFile("C:\\Users\\francesco\\Desktop\\Arnaldo\\programmi\\ProvaXMLManager\\PgAr_Map_5.xml");
		StrutturaDati nuovo = dec.getFile();
		dec.scriviFile(nuovo, "bello", "utf-8", "23");
	}

}
