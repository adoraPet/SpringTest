package io.adorapet.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {
	
	@RequestMapping("/lifecycle/test01/1")
	@ResponseBody
	public String stringResponse() {
		
		return "<h1>테스트 프로젝트 완성</h1><br><h3>해당 프로젝트를 통해 문제풀이를 진행합니다.</h3>";
	}
	
	@RequestMapping("/lifecycle/test01/2")
	@ResponseBody
	public Map<String, Integer> scoreResponse(){
		
		Map<String, Integer> score = new HashMap<>();
		score.put("국어", 80);
		score.put("수학", 90);
		score.put("영어", 85);
		
		return score;
	}
	
	
	
}
