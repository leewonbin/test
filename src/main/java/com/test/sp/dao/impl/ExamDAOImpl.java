package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.vo.Exam;

@Repository
public class ExamDAOImpl implements com.test.sp.dao.ExamDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<Exam> getExamInfoList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.test.sp.vo.Exam.selectExamList");
	}

	@Override
	public Exam getExam(int exnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.test.sp.vo.Exam.selectExam",exnum);
	}

	@Override
	public int insertExam(Exam ei) {
		// TODO Auto-generated method stub
		return ss.insert("com.test.sp.vo.Exam.insertExam",ei);
	}

	@Override
	public int updateExam(Exam ei) {
		// TODO Auto-generated method stub
		return ss.insert("com.test.sp.vo.Exam.updateExam",ei);
	}

	@Override
	public int deleteExam(int exnum) {
		// TODO Auto-generated method stub
		return ss.insert("com.test.sp.vo.Exam.deleteExam",exnum);
	}


}
