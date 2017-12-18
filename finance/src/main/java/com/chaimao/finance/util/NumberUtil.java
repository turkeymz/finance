package com.chaimao.finance.util;

import java.math.BigDecimal;

public class NumberUtil {
	public static double round(double d, int w)
	{
		BigDecimal localBigDecimal1 = new BigDecimal(Double.toString(d));
		BigDecimal localBigDecimal2 = new BigDecimal("1");
		return localBigDecimal1.divide(localBigDecimal2, w, 4).doubleValue();
	}
}
