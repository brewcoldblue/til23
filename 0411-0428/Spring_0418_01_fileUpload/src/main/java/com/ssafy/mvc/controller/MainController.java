package com.ssafy.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;


@Controller
public class MainController {
	@Autowired
	private ServletContext ctx;
	
	@Autowired
	//resource 경로를 가져오기 위해서 사용함
	private ResourceLoader rl;
	
	CommonsMultipartResolver cmr;
	//요거 임포트하면, xml의 bean property에서 모든 옵션 볼 수 있음
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		return "home";
	}
	
	//클라이언트가 regist요청을 하면
	//dispatcherServlet가 handlerMapping을 통해 이거 main controller가면 있다고 알려주고
	//main controller에서 지금 이 메서드에 걸림.
	//원래 model & view의 형태로 리턴하는데, 지금은 문자열 하나만 리턴하고 있으므로
	//viewName이 regist로 설정된 상태로 리턴될것,
	//viewResolver가 regist 문자열을 가져다가 경로를 만들어서
	//web-inf/.../regist.jsp로 이동시키는것
	@GetMapping("regist")
	public String registForm() {
		return "regist";
	}
	
	@PostMapping("upload")
	public String upload(MultipartFile upload_file, Model m) {
		//실제 파일 위치
		String path = ctx.getRealPath("/upload");
		
		//만약 등록하려고 하는 업로드 폴더가 없다면? 하나 만들어라
		File folder = new File(path);
		if(!folder.exists()) folder.mkdir();
		
		//실제 파일 이름
		String fileName = upload_file.getOriginalFilename();
		
		File target = new File(path, fileName);
		
		//파일 저장
		//1. FileCopyUtils
		try {
			FileCopyUtils.copy(upload_file.getBytes(), target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		m.addAttribute("fileName", fileName);
		
		return "result";
	}
	
	@PostMapping("upload2")
	public String upload2(MultipartFile[] upload_files, Model model) throws IOException {
		List<String> list = new ArrayList<>();
		
		if(upload_files != null) {
			Resource res = rl.getResource("resources/upload");
			//아까 그 경로랑 다름!!!!!!!!!!!
			//FileDownloadView의 ctx 경로 바꿔야함
			if(!res.getFile().exists()) res.getFile().mkdir(); //폴더 없으면 디렉토리만들기
			
			//지금은 단순히 업로드라고 하는 폴더에 파일을 그대로 저장하고 있음.
			//폴더 구조 2023/04/18 구조 잡고 저장하는게 좀더 있어 보인다.
			//파일 이름도 실제 저장할 때는 OriginName, 저장할 이름 두 가지로 나눠서 저장하는 것도 방법이다.
			//웨냐면 같은 이름 쓰면 덮어버리니까 고유값을 줘야함.
			
			//2. File인스턴스
			
			for(MultipartFile mfile : upload_files) {
				if(mfile.getSize() > 0) mfile.transferTo(new File(res.getFile(), mfile.getOriginalFilename()));
				//file이 있으면... mfile.transferTo로 저장
				list.add(mfile.getOriginalFilename());
			}
		}
		
		model.addAttribute("list", list);
		
		return "result";
	}
	
	@GetMapping("download")
	public String download(Model model, String fileName) {
		Map<String, Object> fileInfo = new HashMap<>();
		fileInfo.put("fileName", fileName);
		model.addAttribute("downloadFile", fileInfo);
		//view resolver보다 빠르게 뭔가를 처리해야함
		return "fileDownloadView";
	}
	
}
