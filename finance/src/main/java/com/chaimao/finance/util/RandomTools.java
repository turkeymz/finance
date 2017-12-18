package com.chaimao.finance.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomTools {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public static String getMathRandom() {
		String r1 = Double.toString(Math.random()).substring(2);
		if(r1.length() > 9) return r1.substring(0, 8);return (r1 + "00000000").substring(0, 8);
	}
	
	public static String getTimeString() {
		return sdf.format(new Date());
	}
}
