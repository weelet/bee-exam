/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.exam.bee.test;

import org.teasoft.honey.osql.core.Logger;

import org.teasoft.bee.osql.BeeException;
import org.teasoft.exam.bee.osql.ConditionExam;
import org.teasoft.exam.bee.osql.MoreTableExam;
import org.teasoft.exam.bee.osql.PreparedSqlExam;
import org.teasoft.exam.bee.osql.SuidExam;
import org.teasoft.exam.bee.osql.SuidExamEN;
import org.teasoft.exam.bee.osql.SuidRichExam;
import org.teasoft.exam.bee.osql.TransactionExam;
import org.teasoft.exam.bee.osql.UpdateByExam;
import org.teasoft.exam.comm.TestHelper;
import org.teasoft.exam.comm.TestPrepare;
import org.teasoft.honey.osql.util.DateUtil;

/**
 * @author Kingstar
 * @since  1.7.2
 */
public class TestNormal {
	
	public static void main(String[] args) {
	   TestPrepare.init("normal");
		
	    try {
			
		//How to generate the Javabean,please see GenBeanExam.
		//生成Javabean,请查看GenBeanExam.

//		style 1:
//		TestHelper.markStart("SuidExam.test");
//		SuidExam.test();
//		TestHelper.markEnd("SuidExam.test");
		
//		style 2:		
//		TestHelper.runTest(SuidExam.class);
		
//		style 3:
		runTest(SuidExam.class);
		runTest(SuidExamEN.class);
		runTest(SuidRichExam.class);
		runTest(UpdateByExam.class);
		
		runTest(PreparedSqlExam.class);
		
		runTest(TransactionExam.class);
		
		
		runTest(ConditionExam.class);
		
		runTest(MoreTableExam.class);
		
	   } catch (BeeException e) {
			Logger.error(e.getMessage());
	   }
		
	   System.out.println(DateUtil.currentDate()+"  test normal Finished!");
		
	}
	
	public static void runTest(Class c) {
		TestHelper.runTest(c);
	}

}
