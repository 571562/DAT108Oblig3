package no.hvl.dat108;

public class Validator {
	public static boolean validPassord(String passord) {
		return passord != null && passord.length() > 4;
	}
	
	public static boolean validFornavn(String fornavn) {
		return fornavn != null && fornavn.length() <= 20 && fornavn.matches("^([A-ZØÆÅ][\\-\\sa-zA-ZæøåÆØÅ]+)") ;
	}
	
	public static boolean validEtternavn(String etternavn) {
		return etternavn != null && etternavn.length() <= 20 && etternavn.matches("^([A-ZØÆÅ][\\sa-zA-ZæøåÆØÅ]+)");
	}
	
	public static boolean validKjonn(String kjonn) {
		return kjonn.matches("mann") || kjonn.matches("kvinne");
	}
	
	public static boolean validMobilnummer(String mobilnummer) {
		return mobilnummer != null && mobilnummer.matches("[0-9]{8}");
	}
	
	
}
