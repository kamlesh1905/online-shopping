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
		mv.addObject("greeting","Welcome to Spring MVC");
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
