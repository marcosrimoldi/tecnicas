package org.slf4j.impl;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Clase que adapta el fiuba.logger.domain.Logger a la interfaz org.slf4j.Logger. 
 * 
 * @author Marcos Rimoldi
 *
 */
public class Log4TecnicasLoggerAdapter implements Logger {
	
	final transient com.fiuba.logger.domain.Logger logger;
	
	Log4TecnicasLoggerAdapter(com.fiuba.logger.domain.Logger logger) {
		this.logger = logger;
	}


	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		this.debug(arg1);
	}

	public void debug(Marker arg0, String arg1, Object... arg2) {
		this.debug(arg1);
	}

	public void debug(Marker arg0, String arg1, Object arg2) {
		this.debug(arg1);
	}

	public void debug(Marker arg0, String arg1, Throwable arg2) {
		this.debug(arg1);
	}

	public void debug(Marker arg0, String arg1) {
		this.debug(arg1);
	}

	public void debug(String arg0, Object arg1, Object arg2) {
		this.debug(arg0);
	}

	public void debug(String arg0, Object... arg1) {
		this.debug(arg0);
	}

	public void debug(String arg0, Object arg1) {
		this.debug(arg0);
	}

	public void debug(String arg0, Throwable arg1) {
		// TODO implement this correctly.
		this.debug(arg0);
	}

	public void debug(String arg0) {
		logger.debug(arg0);
	}

	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		error(arg1);
	}

	public void error(Marker arg0, String arg1, Object... arg2) {
		error(arg1);
	}

	public void error(Marker arg0, String arg1, Object arg2) {
		error(arg1);
	}

	public void error(Marker arg0, String arg1, Throwable arg2) {
		error(arg1);
	}

	public void error(Marker arg0, String arg1) {
		error(arg1);
	}

	public void error(String arg0, Object arg1, Object arg2) {
		error(arg0);
		
	}

	public void error(String arg0, Object... arg1) {
		error(arg0);
	}

	public void error(String arg0, Object arg1) {
		error(arg0);
	}

	public void error(String arg0, Throwable arg1) {
		// TODO implement this correctly.
		error(arg0);
	}

	public void error(String arg0) {
		logger.error(arg0);
	}

	public String getName() {
		return logger.getName();
	}

	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		info(arg1);
	}

	public void info(Marker arg0, String arg1, Object... arg2) {
		info(arg1);
	}

	public void info(Marker arg0, String arg1, Object arg2) {
		info(arg1);		
	}

	public void info(Marker arg0, String arg1, Throwable arg2) {
		info(arg1);		
	}

	public void info(Marker arg0, String arg1) {
		info(arg1);		
	}

	public void info(String arg0, Object arg1, Object arg2) {
		info(arg0);		
	}

	public void info(String arg0, Object... arg1) {
		info(arg0);
	}

	public void info(String arg0, Object arg1) {
		info(arg0);		
	}

	public void info(String arg0, Throwable arg1) {
		// TODO implement this correctly.
		info(arg0);		
	}

	public void info(String arg0) {
		logger.info(arg0);
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isDebugEnabled(Marker arg0) {
		return this.isDebugEnabled();
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	public boolean isErrorEnabled(Marker arg0) {
		return this.isErrorEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isInfoEnabled(Marker arg0) {
		return this.isInfoEnabled();
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public boolean isTraceEnabled(Marker arg0) {
		return this.isTraceEnabled();
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public boolean isWarnEnabled(Marker arg0) {
		return this.isWarnEnabled();
	}

	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		this.trace(arg1);
	}

	public void trace(Marker arg0, String arg1, Object... arg2) {
		this.trace(arg1);
	}

	public void trace(Marker arg0, String arg1, Object arg2) {
		this.trace(arg1);		
	}

	public void trace(Marker arg0, String arg1, Throwable arg2) {
		this.trace(arg1);		
	}

	public void trace(Marker arg0, String arg1) {
		this.trace(arg1);
	}

	public void trace(String arg0, Object arg1, Object arg2) {
		this.trace(arg0);
	}

	public void trace(String arg0, Object... arg1) {
		this.trace(arg0);
	}

	public void trace(String arg0, Object arg1) {
		this.trace(arg0);
	}

	public void trace(String arg0, Throwable arg1) {
		// TODO implement this correctly.
		this.trace(arg0);
	}

	public void trace(String arg0) {
		logger.trace(arg0);
	}

	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		this.warn(arg1);		
	}

	public void warn(Marker arg0, String arg1, Object... arg2) {
		this.warn(arg1);		
	}

	public void warn(Marker arg0, String arg1, Object arg2) {
		this.warn(arg1);		
	}

	public void warn(Marker arg0, String arg1, Throwable arg2) {
		this.warn(arg1);		
	}

	public void warn(Marker arg0, String arg1) {
		this.warn(arg1);		
	}

	public void warn(String arg0, Object arg1, Object arg2) {
		this.warn(arg0);		
	}

	public void warn(String arg0, Object... arg1) {
		this.warn(arg0);		
	}

	public void warn(String arg0, Object arg1) {
		this.warn(arg0);		
	}

	public void warn(String arg0, Throwable arg1) {
		// TODO implement this correctly.
		this.warn(arg0);		
	}

	public void warn(String arg0) {
		logger.warn(arg0);
	}

	
}
