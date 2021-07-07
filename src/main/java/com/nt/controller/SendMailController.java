package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.RequestModel;
import com.nt.model.ResponceModel;
import com.nt.service.EmailService;

@RestController
public class SendMailController {

	@Autowired
	private EmailService service;

	@PostMapping("/send")
	public ResponceModel sendEmail(@RequestBody RequestModel request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Panchkula,India");
		return service.sendEmail(request, model);

	}

	
	
	
}
