package fi.hh.swd20.Bookstore.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	@RequestMapping (value = "/index", method = RequestMethod.GET)
	
	public String testi() {
		return null;
	}
	
	

}
