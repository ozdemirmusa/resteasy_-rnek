package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KISI database table.
 * 
 */
@Entity
@Table(name="KISI")
@NamedQuery(name="Kisi.findAll", query="SELECT k FROM Kisi k")
public class Kisi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="AD")
	private String ad;

	@Column(name="ADRES")
	private String adres;

	@Column(name="SOYAD")
	private String soyad;

	public Kisi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getSoyad() {
		return this.soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}