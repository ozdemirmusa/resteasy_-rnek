package dao;

import java.util.List;

import model.Kisi;

public interface KisiDao {
	public void kisiEkle(Kisi kisi);
	public void kisiSil(int id);
	public void kisiDuzenle(Kisi kisi);
	public List<Kisi> kisiListele();
	public Kisi kisiBul(int id);

}
