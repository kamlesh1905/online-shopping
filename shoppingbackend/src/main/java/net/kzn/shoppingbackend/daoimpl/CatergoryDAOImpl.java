package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CatergoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;


		
	

	/*
	 * private static List<Category> categories = new ArrayList<>()
	 * static { Category category = new Category(); category.setId(1);
	 * category.setName("Television");
	 * category.setDescription("Samsung smart TV 40UTA00700");
	 * category.setImageURL("CAT_1.png");
	 * 
	 * categories.add(category);
	 * 
	 * Category category1 = new Category(); category1.setId(2);
	 * category1.setName("Mobile"); category1.setDescription("Samsung C9 6inch");
	 * category1.setImageURL("CAT_2.png");
	 * 
	 * categories.add(category1);
	 * 
	 * Category category2 = new Category(); category2.setId(3);
	 * category2.setName("Laptop"); category2.setDescription("Lenova");
	 * category2.setImageURL("CAT_3.png");
	 * 
	 * categories.add(category2);
	 * 
	 * }
	 */

	@Override
	public List<Category> list() 
	{
       String selectActiveCategory="From Category where active=:active";
       
	   Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);	
	   
	   query.setParameter("active", true);
	   
	   return query.getResultList();
	}

	@Override
	public Category get(int id) {

		/*
		 * //enhance for loop for(Category category:categories) {
		 * if(category.getId()==id) { return category; }
		 * 
		 * }
		 */

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override

	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Category category) {

		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) 
	{
			category.setActive(false);
		
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

}
