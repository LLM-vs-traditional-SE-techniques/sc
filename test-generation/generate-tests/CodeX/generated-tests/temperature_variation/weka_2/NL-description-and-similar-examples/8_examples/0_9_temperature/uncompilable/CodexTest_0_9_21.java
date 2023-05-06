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


public class CodexTest_0_9_21 { 
    @Test
    public void testAttributeOfTypeStringEmpty() {
        Attributes a = new Attributes(new String[0][0]);
        String[][] data = new String[][]{
            {"V"},
            {""}
        };
}