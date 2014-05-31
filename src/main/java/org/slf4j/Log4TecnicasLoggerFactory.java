package org.slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que implementa la la interfaz org.slf4j.ILoggerFactory para retornar
 * la instancia del Adapter apropiada. 
 * 
 * @author Marcos Rimoldi
 *
 */
public class Log4TecnicasLoggerFactory implements ILoggerFactory {

	private Map<String, Log4TecnicasLoggerAdapter> loggerMap;
	
	public  Log4TecnicasLoggerFactory() {
		loggerMap = new HashMap<String, Log4TecnicasLoggerAdapter>();
	 }
	
	public Logger getLogger(String name) {
		 // protege el acceso concurrente al loggerMap
		synchronized (loggerMap) {
            if (!loggerMap.containsKey(name)) {
                loggerMap.put(name, new Log4TecnicasLoggerAdapter(com.fiuba.logger.domain.Logger.getLogger(name)));
            }
            return loggerMap.get(name);
        }
	}
	
	
}
