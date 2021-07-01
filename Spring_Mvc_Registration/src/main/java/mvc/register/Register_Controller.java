package mvc.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import mvc.register.entity.Register_Entity;

@Controller
public class Register_Controller 
{
	/*
	 * @Autowired private Register_Dao register_Dao;
	 */
	 
	/*@RequestMapping("/home") URL is used to hit the register.jsp page*/
		@RequestMapping("/home")
		public String Home() 
			{
				return "register";
			}
		
	/*@RequestMapping("/register") URL is used to fetch the Register.jsp page Detail*/
    /*1st Method For Using the @@RequestParam */
	 /*   @RequestMapping("/register")
		public RedirectView Register(@RequestParam("fname")   String fname,
									 @RequestParam("lname")   String lname,
									 @RequestParam("email")   String email,
									 @RequestParam("gender")  String gender,
									 @RequestParam("city")    String city,
									 @RequestParam("country") String country,
									 @RequestParam("password")String password 
									)
		{
			RedirectView rv = new RedirectView();
			System.out.println(fname);
			System.out.println(lname);
			System.out.println(email);
			System.out.println(gender);
			System.out.println(city);
			System.out.println(country);
			System.out.println(password);
			
			return rv;
		}
		*/
		
		/*@RequestMapping("/register") URL is used to fetch the Register_Entity
		   page Detail*/
	    /* 2nd Method For Using the @RequestParam */
		
		/*When we want to use Username like"1234shadab" then it is create 
		 NumberFormatException exception bcz int+String if you want to 
		 ignore this Exception then we will use*/
		@RequestMapping(path = "/register",method = RequestMethod.POST)
		public String Register(@ModelAttribute("Register_Entity")Register_Entity reg,
				 								Model model,BindingResult result)
			{
			if(result.hasErrors())
			{
				return "register";
			}
			
				System.out.println(reg);
				return "success";
			} 
}

