package com.chaimao.finance.util;

public class DBKeyHelp {
	
	private static long iCount = 100001L;
	
	public static String getSerialNo() {
		return getSerialNo("");
	}
	
	public static String getSerialNo(String sPrefix) {
		if(iCount > 999998L) iCount = 100001L;
		return sPrefix + RandomTools.getTimeString() + iCount++;
	}
	
	public static void main(String[] args) {
		System.out.println(DBKeyHelp.getSerialNo());
		System.out.println(DBKeyHelp.getSerialNo());
	}
}
