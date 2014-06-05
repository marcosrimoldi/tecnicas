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
		this.debug(arg1, arg2);
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
		this.logger.debug(arg0, arg1);
	}

	public void debug(String arg0) {
		this.logger.debug(arg0);
	}

	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		this.error(arg1);
	}

	public void error(Marker arg0, String arg1, Object... arg2) {
		this.error(arg1);
	}

	public void error(Marker arg0, String arg1, Object arg2) {
		this.error(arg1);
	}

	public void error(Marker arg0, String arg1, Throwable arg2) {
		this.error(arg1, arg2);
	}

	public void error(Marker arg0, String arg1) {
		this.error(arg1);
	}

	public void error(String arg0, Object arg1, Object arg2) {
		this.error(arg0);
		
	}

	public void error(String arg0, Object... arg1) {
		this.error(arg0);
	}

	public void error(String arg0, Object arg1) {
		this.error(arg0);
	}

	public void error(String arg0, Throwable arg1) {
		this.logger.error(arg0, arg1);
	}

	public void error(String arg0) {
		this.logger.error(arg0);
	}

	public String getName() {
		return this.logger.getName();
	}

	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		this.info(arg1);
	}

	public void info(Marker arg0, String arg1, Object... arg2) {
		this.info(arg1);
	}

	public void info(Marker arg0, String arg1, Object arg2) {
		this.info(arg1);		
	}

	public void info(Marker arg0, String arg1, Throwable arg2) {
		this.info(arg1, arg2);		
	}

	public void info(Marker arg0, String arg1) {
		this.info(arg1);		
	}

	public void info(String arg0, Object arg1, Object arg2) {
		this.info(arg0);		
	}

	public void info(String arg0, Object... arg1) {
		this.info(arg0);
	}

	public void info(String arg0, Object arg1) {
		this.info(arg0);		
	}

	public void info(String arg0, Throwable arg1) {
		this.logger.info(arg0, arg1);
	}

	public void info(String arg0) {
		this.logger.info(arg0);
	}

	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}

	public boolean isDebugEnabled(Marker arg0) {
		return this.isDebugEnabled();
	}

	public boolean isErrorEnabled() {
		return this.logger.isErrorEnabled();
	}

	public boolean isErrorEnabled(Marker arg0) {
		return this.isErrorEnabled();
	}

	public boolean isInfoEnabled() {
		return this.logger.isInfoEnabled();
	}

	public boolean isInfoEnabled(Marker arg0) {
		return this.isInfoEnabled();
	}

	public boolean isTraceEnabled() {
		return this.logger.isTraceEnabled();
	}

	public boolean isTraceEnabled(Marker arg0) {
		return this.isTraceEnabled();
	}

	public boolean isWarnEnabled() {
		return this.logger.isWarnEnabled();
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
		this.trace(arg1, arg2);		
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
		this.logger.trace(arg0, arg1);
	}

	public void trace(String arg0) {
		this.logger.trace(arg0);
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
		this.warn(arg1, arg2);		
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
		this.logger.warn(arg0, arg1);
	}

	public void warn(String arg0) {
		this.logger.warn(arg0);
	}

}
