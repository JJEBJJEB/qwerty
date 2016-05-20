package kr.or.kosta;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/internal.ao")
	public ModelAndView internal() {
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", "이것은 InternalResourceViewResolver");
		return model;
	}
	
	@RequestMapping("/beanname.bo")
	public ModelAndView down(HttpServletRequest request) {
		File file = new File("C:/KOSTA/112th", "123.txt");
		request.setAttribute("fileName", "이름_재지정.txt");
		return new ModelAndView("fileDownloadView", "fileDownload", file);
	}
	
	@RequestMapping("/xml.co")
	public ModelAndView xml() {
		ModelAndView model = new ModelAndView();
		model.setViewName("articleView");
		model.addObject("msg", "이것은 XmlViewResolver");
        return model;
	}
	
	@RequestMapping("/resource.do")
	public ModelAndView resouce() {
		ModelAndView model = new ModelAndView();
		model.setViewName("resourceView");
		model.addObject("msg", "이것은 ResourceBundleViewResolver");
        return model;
	}
	
	@RequestMapping("/velocity.eo")
	public ModelAndView velocity() {
		ModelAndView model = new ModelAndView();
		model.setViewName("test05");
		model.addObject("greeting", "Hi!");
		model.addObject("me", "Daekyu Kang");
	    return model;
	}
}
