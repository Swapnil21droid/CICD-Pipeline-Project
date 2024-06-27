package com.personal.CICD_Pipeline_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineProjectApplication.class, args);
	}

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to CICD Pipeline Project !!!";
	}

//	echo "# CICD-Pipeline-Project" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Swapnil21droid/CICD-Pipeline-Project.git
//	git push -u origin main

}
