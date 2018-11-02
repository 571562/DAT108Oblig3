package no.hvl.dat108;

public class Skjema {

	private String fornavn;
	private String etternavn;
	private String mobil;
	private String kjonn;
	private String passord;
	private String passordRepetert;
	private boolean mobilLedig;

	Skjema() {

	}

	public Skjema(String fornavn, String etternavn, String mobil, String kjonn, String passord,
			String passordRepetert) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.mobil = mobil;
		this.kjonn = kjonn;
		this.passord = passord;
		this.passordRepetert = passordRepetert;
	}

	Deltager lagDeltager() {
		String salthash = PassordUtil.krypterPassord(passord);

		return new Deltager(getFornavn(), getEtternavn(), getMobil(), getKjonn(), salthash);
	}

	SkjemaResultat lagSkjemaResultat() {
		return new SkjemaResultat(
				isFornavnGyldig() ? fornavn : "",
				isEtternavnGyldig() ? etternavn : "",
				isMobilGyldig() ? mobil : "",
				isKjonnGyldig() ? kjonn : "",
				isPassordGyldig(),
				isPassordRepetert(),
				isMobilLedig());
		
	}

	public boolean isMobilLedig() {
		return mobilLedig;
	}

	public void setMobilLedig(boolean mobilledig) {
		this.mobilLedig = mobilledig;

	}

	public boolean isFornavnGyldig() {
		return Validator.validFornavn(fornavn);
	}

	public boolean isEtternavnGyldig() {
		return Validator.validEtternavn(etternavn);
	}

	public boolean isMobilGyldig() {
		return Validator.validMobilnummer(mobil);
	}

	public boolean isKjonnGyldig() {
		return Validator.validKjonn(kjonn);
	}

	public boolean isPassordGyldig() {
		return Validator.validPassord(passord);
	}
	
	public boolean isPassordRepetert() {
		return passord.equals(passordRepetert);
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
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
}
