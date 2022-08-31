package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Contato;
import util.HibernateUtil;

public class ContatoDAO {

	public void saveContato(Contato contato) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();
			session.save(contato);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Abrio a sessão mas falhou");
			}
		}
	}

	public void updateContato(Contato contato) {

		Transaction transaction = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();
			session.saveOrUpdate(contato);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("abriu transaction mas falhou");
			}
		}
	}

	public Contato getContatoById(Integer id) {
		Transaction transaction = null;
		Contato contato = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			contato = session.get(Contato.class, id);

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("abriu transaction mas falhou");
			}
		}
		return contato;
	}
	
	public void deleteContato(Integer id) {
		Transaction transaction = null;
		Contato contato = null;
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
