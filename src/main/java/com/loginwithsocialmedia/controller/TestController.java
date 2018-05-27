package com.loginwithsocialmedia.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loginwithsocialmedia.annotation.Timmed;

@Controller
public class TestController {

	public static final Logger log = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/wel", method = RequestMethod.GET)
	@ResponseBody
	@Timmed
	public String test() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello";
	}
}
