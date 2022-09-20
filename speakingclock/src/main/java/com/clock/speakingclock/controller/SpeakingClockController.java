package com.clock.speakingclock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clock.speakingclock.service.ClockService;




@RestController
@RequestMapping("/api/clock")
public class SpeakingClockController {

	@Autowired
	public ClockService clockService;
	
	@GetMapping("/currentTime")
	public String getCurrentTime() {
		Logger log=LoggerFactory.getLogger(SpeakingClockController.class);
		
		log.info("Inside getCurrentTime method of SpeakingClockController");
		String time= clockService.getTime();
		log.info("Exiting getCurrentTime method of SpeakingClockController");
		return time;
	}
	
}
