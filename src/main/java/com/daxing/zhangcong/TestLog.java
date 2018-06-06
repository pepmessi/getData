package com.daxing.zhangcong;

import org.apache.log4j.Logger;


public class TestLog {
	public static Logger logger = Logger.getLogger(TestLog.class);
	
	public static void main(String[] args) {
		logger.info("haha");
		logger.error("cccc");
	}
}
