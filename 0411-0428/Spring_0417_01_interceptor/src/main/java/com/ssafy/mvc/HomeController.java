package com.ssafy.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//regist 요청이 들어오면, regist.jsp로 보내면 좋겟다
	//근데 요청이 a태그를 이용해서 날아옴 -> get
	@RequestMapping(value = "regist", method = RequestMethod.GET)
	public String regist(Model m) {
		//로그인 했으면 ㄱㄱ
		//로그인 안 했으면 ㄱㄱ 를 if-else로 만들수도 있지만
		//loginInterceptor를 만들어서 처리가능
		return "regist";
	}
	
	@GetMapping("login")
	public String loginForm(Model m) {
		//로그인 했으면 ㄱㄱ
		//로그인 안 했으면 ㄱㄱ 를 if-else로 만들수도 있지만
		//loginInterceptor를 만들어서 처리가능
		return "login";
	}
	
	@PostMapping("login")
	public String login(HttpSession session, String id, String pw) { //여기 알아서 들어갑니다!!!!
		//@requestParams도 참조할것
		
		//원래 DAO 가서 데이터베이스 가서 비교해야하는데 대충 때움
		if(id.equals("ssafy") && pw.equals("1234")) {
			session.setAttribute("id", id);
			return "redirect:/"; //님성공임
		}
		return "redirect:/login"; //님 이거실패임
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		return "redirect:/";
	}
}
