package com.aman.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CdController {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Hello to CICd working fine git action";
	}
	//git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Aman80520/github-action-example.git
//	git push -u origin main
		
	
}
