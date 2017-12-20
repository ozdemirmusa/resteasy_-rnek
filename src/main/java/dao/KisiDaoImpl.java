package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Kisi;

public class KisiDaoImpl implements KisiDao {
	 EntityManager em=Persistence.createEntityManagerFactory("resteasy").createEntityManager();

	@Override
	public void kisiEkle(Kisi kisi) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(kisi);
		em.getTransaction().commit();
		
		
	}

	@Override
	public void kisiSil(int id) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(em.find(Kisi.class, id));
		em.getTransaction().commit();
		
	}

	@Override
	public void kisiDuzenle(Kisi kisi) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(kisi);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Kisi> kisiListele() {
		// TODO Auto-generated method stub
		//List<Kisi> kisiler=em.createQuery("SELECT k FROM Kisi k",Kisi.class).getResultList();
		
		return em.createNamedQuery("Kisi.findAll", Kisi.class).getResultList();
	}

	@Override
	public Kisi kisiBul(int id) {
		// TODO Auto-generated method stub
		return em.createQuery("Select k from Kisi k where k.id=:id",Kisi.class).setParameter("id", id).getSingleResult();
	}

}
