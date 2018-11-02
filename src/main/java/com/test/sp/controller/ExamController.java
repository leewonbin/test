package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.impl.ExamServiceImpl;
import com.test.sp.vo.Exam;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class ExamController {
	@Autowired
	private ExamServiceImpl esi;
	@GetMapping(value="/exams")
	public @ResponseBody List<Exam> getList() {
		return esi.getExamInfoList();
	}
	
}
