package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * 
 * @author Marcos Rimoldi
 *
 */
public class StaticLoggerBinder implements LoggerFactoryBinder {

	/**
     * The unique instance of this class.
     */
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
 
    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }
	
    // To avoid constant folding by the compiler,
    // this field must *not* be final
    public static String REQUESTED_API_VERSION = "1.7.5"; 
 
    private static final String loggerFactoryClassStr = Log4TecnicasLoggerFactory.class.getName();
 
    /**
     * The ILoggerFactory instance returned by the
     * {@link #getLoggerFactory} method should always be the same
     * object.
     */
    private final ILoggerFactory loggerFactory;
 
    private StaticLoggerBinder() {
        loggerFactory = new Log4TecnicasLoggerFactory();
    }
 
    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }
 
    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }
    
	
}
