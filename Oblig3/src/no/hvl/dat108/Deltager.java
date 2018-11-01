package no.hvl.dat108;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "dat108oblig3", name = "deltager")
public class Deltager {
	private String fornavn;
	private String etternavn;
	private String kjonn;
	@Id
	private String mobilnummer;
	private String pass;
	
	public Deltager(String fornavn, String etternavn, String kjonn, String mobilnummer, String pass) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.mobilnummer = mobilnummer;
		this.pass = pass;
	}
	
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}
	
	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}
	
	public String getKjonn() {
		return kjonn;
	}
	
	public void setMobil(String mobilNummer) {
		this.mobilnummer = mobilNummer;
	}
	
	public String getMobil() {
		return mobilnummer;
	}
	
	public void setPass(String passord) {
		this.pass = passord;
	}
	
	public String getPass() {
		return pass;
	}
}
