package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static CategoryDAO categoryDAO;

	@Autowired
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * category.setName("Television");
	 * category.setDescription("Samsung smart TV 40UTA00700");
	 * category.setImageURL("CAT_1.png");
	 * assertEquals("Succesfully added a category inside the table", true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() { category = categoryDAO.get(1);
	 * 
	 * assertEquals("Succesfully fetched single category","Television",category.
	 * getName()); }
	 */

	/*
	 * @Test public void testupdateCategory() { category = categoryDAO.get(1);
	 * category.setName("TV");
	 * 
	 * assertEquals("Succesfully updated",true,categoryDAO.update(category)); }
	 */

	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.get(2);
	 * 
	 * assertEquals("Succesfully deleted", true, categoryDAO.delete(category)); }
	 */
	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Succesfully fetched",2,categoryDAO.list().size()); }
	 */

	@Test
	public void testCRUDCategory() {
		// add Operation
		 
		  category = new Category();
		  category.setName("Television");
		  category.setDescription("Samsung smart TV 40UTA00700");
		  category.setImageURL("CAT_1.png");
		  assertEquals("Succesfully added a category inside the table", true,
		  categoryDAO.add(category));
		 

		category = new Category();
		category.setName("Laptop");
		category.setDescription("LG Laptop");
		category.setImageURL("CAT_2.png");
		assertEquals("Succesfully added a category inside the table", true, categoryDAO.add(category));

		category = categoryDAO.get(1);
		assertEquals("Succesfully fetched single category", "Television", category.getName());

		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Succesfully updated", true, categoryDAO.update(category));

		category = categoryDAO.get(2);
		assertEquals("Succesfully deleted", true, categoryDAO.delete(category));

		assertEquals("Succesfully fetched", 1, categoryDAO.list().size());

	}

}
