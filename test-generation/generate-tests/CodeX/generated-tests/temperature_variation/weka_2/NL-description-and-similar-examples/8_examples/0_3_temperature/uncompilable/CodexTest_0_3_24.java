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


public class CodexTest_0_3_24 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C,D\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n" + "a,b,c,d\n"
                        + "a
}