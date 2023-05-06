import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
    /**
     * Test Instances
     */
        private Instances dataset = null;
		
	/**
	 * Test File object
	 */
        private File file = null;
		
	/**
	 * Test File path
	 */
        private String testFileName = "";
	
	/**
	 * Session object
	 */
	private ArffSession session = null;
	
	/**
	 * Constructor
	 */
        public void testGroupFiles()
	{
            String directory = "";
            ArrayList<String> filesToCompress = null;
            boolean result = session.groupFiles(directory, filesToCompress);
            assertFalse(result);
            // add additional test code here
        }

}