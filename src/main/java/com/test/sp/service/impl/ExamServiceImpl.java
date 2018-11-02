package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.impl.ExamDAOImpl;
import com.test.sp.service.ExamService;
import com.test.sp.vo.Exam;



@Service
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	private ExamDAOImpl edao;
	
	@Override
	public List<Exam> getExamInfoList() {
		// TODO Auto-generated method stub
		return edao.getExamInfoList();
	}

	@Override
	public Exam getExam(int exnum) {
		// TODO Auto-generated method stub
		return edao.getExam(exnum);
	}

	@Override
	public int insertExam(Exam ei) {
		// TODO Auto-generated method stub
		return edao.insertExam(ei);
	}

	@Override
	public int updateExam(Exam ei) {
		// TODO Auto-generated method stub
		return edao.updateExam(ei);
	}

	@Override
	public int deleteExam(int exnum) {
		// TODO Auto-generated method stub
		return edao.deleteExam(exnum);
	}

}
