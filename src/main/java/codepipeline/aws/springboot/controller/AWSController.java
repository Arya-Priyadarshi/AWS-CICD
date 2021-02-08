package codepipeline.aws.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aws")
@RestController
public class AWSController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello AWS";
	}
}
