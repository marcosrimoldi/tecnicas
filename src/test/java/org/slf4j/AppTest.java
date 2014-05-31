package org.slf4j;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest { 

	@Test
    public void testApp() {
		Logger logger = LoggerFactory.getLogger(AppTest.class);
	    logger.info("Hello World");
		Assert.assertTrue(true);
    }
}
