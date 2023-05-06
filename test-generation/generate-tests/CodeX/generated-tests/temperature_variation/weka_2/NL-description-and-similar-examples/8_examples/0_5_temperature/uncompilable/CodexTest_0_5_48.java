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


public class CodexTest_0_5_48 { 
  @Test
    public void testGetAsInstance() {
        double[] data = {1.0, 2.0, 3.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new StringReader("@RELATION test\n" +
                "@ATTRIBUTE a NUMERIC\n" +
                "@ATTRIBUTE b NUMERIC\n" +
                "@ATTRIBUTE c NUMERIC\n" +
                "@ATTRIBUTE d NUMERIC\n" +
                "@ATTRIBUTE e NUMERIC\n" +
                "@ATTRIBUTE f NUMERIC\n" +
                "@ATTRIBUTE g NUMERIC\n" +
                "@ATTRIBUTE h NUMERIC\n" +
                "@ATTRIBUTE i NUMERIC\n" +
                "@ATTRIBUTE j NUMERIC\n" +
                "@ATTRIBUTE k NUMERIC\n" +
                "@ATTRIBUTE l NUMERIC\n" +
                "@ATTRIBUTE m NUMERIC\n" +
                "@ATTRIBUTE n NUMERIC\n" +
                "@ATTRIBUTE o NUMERIC\n" +
                "@ATTRIBUTE p NUMERIC\n" +
                "@ATTRIBUTE q NUMERIC\n" +
                "@ATTRIBUTE r NUMERIC\n" +
                "@ATTRIBUTE s NUMERIC\n" +
                "@ATTRIBUTE t NUMERIC\n" +
                "@ATTRIBUTE u NUMERIC\n" +
                "@ATTRIBUTE v NUMERIC\n" +
                "@ATTRIBUTE w NUMERIC\n" +
                "@ATTRIBUTE x NUMERIC\n" +
                "@ATTRIBUTE y NUMERIC\n" +
                "@ATTRIBUTE z NUMERIC\n" +
                "@DATA\n" +
                "1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0
}