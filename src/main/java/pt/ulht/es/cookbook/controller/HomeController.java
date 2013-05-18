package pt.ulht.es.cookbook.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
  
	@RequestMapping(method=RequestMethod.GET, value="home")
	public String showHome(Model model) {

        Date date = new Date(System.currentTimeMillis());
        DateFormat df = DateFormat.getDateInstance();
        model.addAttribute("currentTime", df.format(date));
        

        
		return "home";
	}


	@RequestMapping(method=RequestMethod.GET, value="about")
	public String showAbout(Model model) {
		model.addAttribute("nome1", "Marcelo Martins");
        model.addAttribute("nome2", "João Mendes");
        model.addAttribute("nome3", "Marco Teixeira");
		
		return "about";
	}

}