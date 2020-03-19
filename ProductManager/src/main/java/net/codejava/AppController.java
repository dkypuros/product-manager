package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Annotate this class with spring "controller" annotation. That denotes this class as a part of the Spring Framwork
 * note: import org.springframework.stereotype.Controller;
 */
@Controller
public class AppController {
/*
 * This refers to an instance of the "ProductService" class
 * We use the annotation from spring "@Autowired"
 * note: import org.springframework.beans.factory.annotation.Autowired
 */
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
}
