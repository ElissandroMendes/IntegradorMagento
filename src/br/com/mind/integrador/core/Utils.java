package br.com.mind.integrador.core;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
	
	public static String StackTraceToString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
//		if (ExceptionUtils.indexOfThrowable(e, AxisFault.class) != -1) {
//			AxisFault ex = (AxisFault) e;
//			pw.print(ex.getFaultCode() + ": " + ex.getFaultString()); 
//		} else {
			e.printStackTrace(pw);
			e.printStackTrace();
//		}
		return sw.toString();				
	}
}

