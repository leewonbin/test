package com.test.sp.dao;

import java.util.List;

import com.test.sp.vo.Exam;

public interface ExamDAO {
	public List<Exam> getExamInfoList();
	public Exam getExam(int exnum);
	public int insertExam(Exam ei);
	public int updateExam(Exam ei);
	public int deleteExam(int exnum);
}
