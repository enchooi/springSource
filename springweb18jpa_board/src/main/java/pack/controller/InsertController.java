package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.BoardDao;

@Controller
public class InsertController {
	@Autowired
	private BoardDao dao;
	
	@GetMapping("insert")
	public String insert() {
		return "insform";
	}

	@PostMapping("insert")
	public String insertSummit(BoardBean bean, Model model) {
		String str = dao.insertData(bean);
		
		if(str.equals("success")) {
			return "redirect:/list";	// 리스트 컨트롤러를 만나 추가 후 목록 보기 가능
		}else {
			model.addAttribute("msg", str);
			return "error";			
		}
	}

	
	
}
