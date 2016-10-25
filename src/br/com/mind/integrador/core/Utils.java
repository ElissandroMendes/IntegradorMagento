package br.com.mind.integrador.core;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.axis.AxisFault;
import org.apache.commons.lang.exception.ExceptionUtils;

public class Utils {
	
	public static String StackTraceToString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		if (ExceptionUtils.indexOfThrowable(e, AxisFault.class) != -1) {
			AxisFault ex = (AxisFault) e;
			pw.print(ex.getFaultCode() + "\r\n" + ex.getFaultString()); 
		} else {
			e.printStackTrace(pw);
		}
		return sw.toString();				
	}
}

