package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamhName;
	
	@GetMapping("/teamInfo")
	public String getTeamInfo() {
		return "Coach name: "+coachName+" and team name: "+teamhName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world!! Time on the server is: "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}
}
