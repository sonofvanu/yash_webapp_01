package ecommerce.yash_webapp_01.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ecommerce.yash_webapp_01.model.RegistrationModel;
import ecommerce.yash_webapp_01.model.SupplierModel;

public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<SupplierModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Registration").list();
	}

	@Override
	public void insert(SupplierModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(p);
	}

	@Override
	public void update(SupplierModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	@Override
	public SupplierModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(SupplierModel.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

}
