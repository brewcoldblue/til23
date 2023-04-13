package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.model.dto.User;
import mvc.model.service.MyService;

@Controller
public class MyController {
	
	private MyService myService;
	
	//setter에서 의존성 주입.
	@Autowired
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	//MAV가 바구니고 리턴 타입이 됨
	@RequestMapping("home") //home이라는 요청이 들어오면 내가 처리하겠다
	//@RequestMapping(value = "home", method = RequestMethod.GET) 쓰는 거 불편함
	//그래서 @GetMapping("xxx"), @PostMapping("yyy")가 존재함.
	public ModelAndView home() {

		
		
		ModelAndView mav = new ModelAndView();
		
		//mav.addObject("k", "v");
		
		mav.addObject("msg", "welcome!");
		

		myService.doSomething();
		
		//view 이름 지정해줌
		//포워딩을 한것과 동일하다고 할 수 있음
		//만약 return redirect:xxx 하면 리다이렉트됨!!
		mav.setViewName("home");
		return mav;
	}
	
	//이거 왜 반환타입 문자열임?
	@GetMapping("test1")
	public String test1() {
		//WEB-INF/view/test1.jsp
		return "test1";
	}
	
	//반환타입이 문자열일때 가져가고 싶은 값이 있다면? 
	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("msg", "바구니에 데이터를 넣어서 보냈다");
		return "test2";
	}
	
	//파라미터로 여러개 받을때
	@GetMapping("test3")
	public String test3(Model model, String id, String pw) {
		model.addAttribute("id", id);
		model.addAttribute("password", pw);
		return "test3";
	}
	
	//여기 있는 id는 사실 myId입니다! 라는 뜻임 얘는 그럼 이제 id로 못 씀
	//왜? required 때문임... 이거 처리해주면 가능함. 근데 id로 하면 무시함
	//http://localhost:8080/Spring_0413_01_MyMVC/test4?id=1&pw=111 (id 씹힘)
	//http://localhost:8080/Spring_0413_01_MyMVC/test4?myId=1&pw=111 (O)
	//또, requestParam에는 기본적으로 NULL이 들어가는데, 기초자료형에는 NULL을 넣을수없어서
	//없으면 에러남. 그래서 defaultvalue="333" 처럼 기본값 설정 가능하고 그렇게 해주면 됨.
	@GetMapping("test4")
	public String test4(Model model, @RequestParam(value="myId", required=false)String id, String pw) {
		model.addAttribute("id", id);
		model.addAttribute("password", pw);
		return "test4";
	}
	
	@PostMapping("test5")
	//user 객체를 파라미터들의 바구니로 사용할 수 있다. 적절한 DTO를 준비해 놓으면
	//알아서 잘 돌릴수 있음 와우~
	public String test5(Model model, User user) {
		System.out.println(user);
		return "t5";
	}
}
