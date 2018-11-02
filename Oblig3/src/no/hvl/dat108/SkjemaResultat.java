package no.hvl.dat108;

public class SkjemaResultat {
	private String fornavn;
	private String etternavn;
	private String mobil;
	private String kjonn;
	private boolean passordGyldig;
	private boolean passordRepetert;
	private boolean mobilLedig;

	public String getFornavn() {
		return fornavn;

	}

	public SkjemaResultat() {

	}

	boolean isAlleGyldig() {
		return fornavn != "" && etternavn != "" && mobil != "" && kjonn != "" && passordGyldig && passordRepetert
				&& mobilLedig;
	}

	public SkjemaResultat(String fornavn, String etternavn, String mobil, String kjonn, boolean passordGyldig,
			boolean passordRepetert, boolean mobilLedig) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.mobil = mobil;
		this.kjonn = kjonn;
		this.passordGyldig = passordGyldig;
		this.passordRepetert = passordRepetert;
		this.mobilLedig = mobilLedig;

	}

	public boolean isMobilLedig() {
		return mobilLedig;
	}

	public void setMobilLedig(boolean mobilLedig) {
		this.mobilLedig = mobilLedig;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getKjonn() {
		return kjonn;
	}

	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}

	public boolean isPassordGyldig() {
		return passordGyldig;
	}

	public void setPassordGyldig(boolean passordGyldig) {
		this.passordGyldig = passordGyldig;
	}

	public boolean isPassordRepetert() {
		return passordRepetert;
	}

	public void setPassordRepetert(boolean passordRepetert) {
		this.passordRepetert = passordRepetert;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

}
