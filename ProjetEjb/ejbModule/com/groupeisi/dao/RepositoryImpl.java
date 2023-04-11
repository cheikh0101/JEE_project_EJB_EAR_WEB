package com.groupeisi.dao;

import java.util.List;

import com.groupeisi.config.HibernateUtil;
import com.groupeisi.interfaces.IRepository;

import javax.ejb.Stateless;

import org.hibernate.Session;
import org.hibernate.Transaction;

@Stateless
public class RepositoryImpl<T> implements IRepository<T> {

	 protected Session session;
	 protected Transaction transaction;
	 
	 public RepositoryImpl(){
		 session = HibernateUtil.getSessionFactory().openSession();
	 }

	@Override
	public int add(T t) {
		transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();
        return 1;	}

	@Override
	public int update(T t) {
		transaction = session.beginTransaction();
		session.merge(t);
		transaction.commit();
		return 1;
	}

	@Override
	public int delete(int id, T t) {
		transaction = session.beginTransaction();
		session.delete(session.get(t.getClass(), id));
		transaction.commit();
		return 1;
	}

	@Override
	public List<T> list(T t) {
		return (List<T>) session.createCriteria(t.getClass()).list();
	}

	@Override
	public T get(int id, T t) {
		return (T) session.get(t.getClass(), id);
	}

}
