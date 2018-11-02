package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.dao.impl.ExamDAOImpl;
import com.test.sp.service.ExamService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ExamTest {
	
	@Autowired
	private ExamDAOImpl edao;
	
	@Autowired
	private ExamService eis;
	
	@Test
	public void listTest() {
		assertEquals(3, edao.getExamInfoList().size());
	}
	
	@Test
	public void objectTest() {
		assertNotNull(edao.getExam(1));
	}
	
	@Test
	public void Testservice() {
		assertNotNull(eis.getExam(1));
	}

}
