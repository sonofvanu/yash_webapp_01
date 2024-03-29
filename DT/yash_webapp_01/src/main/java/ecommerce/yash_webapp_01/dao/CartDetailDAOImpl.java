package ecommerce.yash_webapp_01.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ecommerce.yash_webapp_01.model.CartDetailModel;
@Repository
@Transactional
public class CartDetailDAOImpl implements CartDetailDAO {
@Autowired
	
	private SessionFactory sessionFactory; 
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<CartDetailModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from CartDetailModel").list();
	}

	@Override
	public void insert(CartDetailModel c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(c);
	}

	@Override
	public CartDetailModel get(int cid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CartDetailModel.class, cid);
	}

	@Override
	public void update(CartDetailModel c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().remove(get(cid));
	}

}
