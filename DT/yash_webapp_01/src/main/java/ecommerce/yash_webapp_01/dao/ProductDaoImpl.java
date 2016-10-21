package ecommerce.yash_webapp_01.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.ProductModel;


@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM ProductModel").list();
	}

	@Override
	public void insert(ProductModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(p);
	}

	@Override
	public void update(ProductModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	@Override
	public ProductModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProductModel.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

}