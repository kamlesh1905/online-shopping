package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CatergoryDAOImpl implements CategoryDAO 
{
	
	private static List<Category> categories = new ArrayList<>();

	static 
	{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Samsung smart TV 40UTA00700");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("Samsung C9 6inch");
		category1.setImageURL("CAT_2.png");
		
		categories.add(category1);
		
		Category category2 = new Category();
		category2.setId(3);
		category2.setName("Laptop");
		category2.setDescription("Lenova");
		category2.setImageURL("CAT_3.png");
		
		categories.add(category2);
		
	}

	@Override
	public List<Category> list() 
	{
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhance for loop
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
			
		}
		return null;
	}

}
