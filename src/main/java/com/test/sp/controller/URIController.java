package com.test.sp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class URIController {
	@GetMapping(value="/uri/**")
	public String goPage(HttpServletRequest req) {
		String uri = req.getRequestURI();
		uri = uri.replace("/uri/", "");
		return uri;

	}
}
