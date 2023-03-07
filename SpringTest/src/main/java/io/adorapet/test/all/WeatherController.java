package io.adorapet.test.all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weather")
public class WeatherController {

	@GetMapping("/weatherpage")
	public String mainPage() {
		return "jstl/weatherpage";
	}
	@GetMapping("/weatheradd")
	public String addPage() {
		return "jstl/weatherinput";
	}
}
