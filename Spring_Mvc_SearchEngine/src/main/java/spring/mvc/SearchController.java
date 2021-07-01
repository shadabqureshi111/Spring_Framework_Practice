package spring.mvc;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController 
{
	@RequestMapping("/home")
	public String Home()
	{
		return "home";
	}
	
	@RequestMapping("/search")
	
	public RedirectView Search(@RequestParam("querybox") String query,Model model)
	{
		
		RedirectView rv = new RedirectView();
		
		if(query.length()==0)
		{
			rv.setUrl("home");
			model.addAttribute("msg","Please Type In Search Box..");
		}
		
		else
		{
			String url="https://www.google.com/search?q="+query;
			rv.setUrl(url);
		}
		return rv;
	}
}
