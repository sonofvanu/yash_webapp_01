package ecommerce.yash_webapp_01.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.yash_webapp_01.model.CategoryModel;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {
	@Autowired

	private SessionFactory sessionFactory;

	
	@Override
	public List<CategoryModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Category").list();
	}

	@Override
	public void insert(CategoryModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(p);
	}

	@Override
	public void update(CategoryModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);

	}

	@Override
	public CategoryModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CategoryModel.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

}
