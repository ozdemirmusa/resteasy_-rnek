package resteasy;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.KisiDaoImpl;
import model.Kisi;

@Path("/servis")
public class Servis {

	KisiDaoImpl kisiDaoImpl = new KisiDaoImpl();

	@POST
	@Path("/ekle")
	@Consumes("application/json")
	public void ekle(Kisi kisi) {
		kisiDaoImpl.kisiEkle(kisi);

	}

	@DELETE
	@Path("/sil/{id}")
	public void sil(@PathParam("id") int id) {
		System.out.println("Kişi Silme İşlemi");
		kisiDaoImpl.kisiSil(id);
	}

	@GET
	@Path("/bul/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Kisi deneme(@PathParam("id") int id) {
		Kisi k = new Kisi();
		k = kisiDaoImpl.kisiBul(id);
		return k;

	}

	@GET
	@Path("/listele")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Kisi> listele() {
		List<Kisi> kisiler = kisiDaoImpl.kisiListele();
		return kisiler;

	}

}
