package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static ProductDAO productDAO;

	@Autowired
	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	/*
	 * @Test public void testCRUDProduct() {
	 * 
	 * product=new Product();
	 * 
	 * product.setName("Samsung Note 10"); product.setBrand("Samsung");
	 * product.setDescription("This is Samsung Note 10");
	 * product.setUnitPrice(30000); product.setActive(true);
	 * product.setCategoryId(3); product.setSupplierId(3);
	 * assertEquals("something went wrong while inserting product",true,productDAO.
	 * add(product));
	 * 
	 * product = productDAO.get(2); product.setName("Samsung Galaxy S7");
	 * 
	 * assertEquals("something went wrong while updating product",true,productDAO.
	 * update(product));
	 * 
	 * assertEquals("something went wrong while deleting product",true,productDAO.
	 * delete(product));
	 * 
	 * assertEquals("list of records",6,productDAO.list().size());
	 * 
	 * }
	 */

	/*
	 * @Test public void testListActiveProduct() {
	 * assertEquals("Something went wrong while fetching the list of produt!",5,
	 * productDAO.listActiveProducts().size());
	 * 
	 * }
	 */

	/*
	 * @Test public void testListActiveProductByCategory() {
	 * assertEquals("Something went wrong while fetching active products by category"
	 * ,3, productDAO.listActiveProductByCategory(3).size());
	 * 
	 * assertEquals("Something went wrong while fetching active products by category"
	 * ,2, productDAO.listActiveProductByCategory(1).size());
	 * 
	 * }
	 */

	@Test
	public void testGetLatestActiveProducts() {

		assertEquals("Something went wrong while fetching Latest active products",3,
				productDAO.getLatestActiveProducts(3).size());
	}

}
