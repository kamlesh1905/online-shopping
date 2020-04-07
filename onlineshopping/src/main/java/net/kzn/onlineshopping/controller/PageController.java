package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
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
