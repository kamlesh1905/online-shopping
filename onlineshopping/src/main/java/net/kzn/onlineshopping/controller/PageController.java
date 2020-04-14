package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller
public class PageController 
{
	
	@Autowired
	CategoryDAO categoryDAO; 
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/* Method to load all the products */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("page");
		//category DAO to fetch a single category
		Category category=null;
		
		category = categoryDAO.get(id);
		mv.addObject("title",category.getName());
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		//passing the single category object
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	
	
	
	/*
	 * @RequestMapping(value="/test") public ModelAndView
	 * test(@RequestParam("greetingfromUrl")String greetingVar) { ModelAndView mv =
	 * new ModelAndView("page"); mv.addObject("greetingofjsp",greetingVar); return
	 * mv; }
	 */

	/*
	 * @RequestMapping(value="/test") public ModelAndView
	 * test(@RequestParam(value="greetingfromUrl",required=false) String
	 * greetingVar) { if(greetingVar == null) { greetingVar="Hello All"; }
	 * ModelAndView mv = new ModelAndView("page");
	 * mv.addObject("greetingofjsp",greetingVar); return mv;
	 * 
	 * }
	 */
	 
	/*
	 * @RequestMapping(value="/test/{greetingfromUrl}") public ModelAndView
	 * test(@PathVariable("greetingfromUrl")String greetingVar) { ModelAndView mv =
	 * new ModelAndView("page"); mv.addObject("greetingofjsp",greetingVar); return
	 * mv;
	 * 
	 * }
	 */
	 
	
	
	
	
	
}
