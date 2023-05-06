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


public class CodexTest_0_9_8 { 
  @Test public void testGetAsInstance() throws Exception {
    FastVector atts = new FastVector();
    atts.addElement(new Attribute("att" + 0));
    atts.addElement(new Attribute("att" + 1));
    
		String target = "target";
		atts.addElement(new Attribute(target));
		for (int i = 0; i < 10; i++)
		  atts.addElement(new Att
}