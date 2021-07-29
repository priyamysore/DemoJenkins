package com.demo.jen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoTest {

	@RequestMapping("/serviceone")
	public String serviceOneMethod() {
		return "demo for jenkins";
	}
	//http://localhost:9091/demo/serviceone
}
