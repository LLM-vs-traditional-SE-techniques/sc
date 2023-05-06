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


public class CodexTest_0_4_16 { 
  @Test
    public void testGetAsInstance() {
        try {
            AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
            Instances model = new Instances(new BufferedReader(new StringReader(
                    "@RELATION test\n"
                            + "@ATTRIBUTE a1 NUMERIC\n"
                            + "@ATTRIBUTE a2 NUMERIC\n"
                            + "@ATTRIBUTE a3 NUMERIC\n"
                            + "@ATTRIBUTE a4 NUMERIC\n"
                            + "@ATTRIBUTE a5 NUMERIC\n"
                            + "@ATTRIBUTE a6 NUMERIC\n"
                            + "@ATTRIBUTE a7 NUMERIC\n"
                            + "@ATTRIBUTE a8 NUMERIC\n"
                            + "@ATTRIBUTE a9 NUMERIC\n"
                            + "@ATTRIBUTE a10 NUMERIC\n"
                            + "@ATTRIBUTE a11 NUMERIC\n"
                            + "@ATTRIBUTE a12 NUMERIC\n"
                            + "@ATTRIBUTE a13 NUMERIC\n"
                            + "@ATTRIBUTE a14 NUMERIC\n"
                            + "@ATTRIBUTE a15 NUMERIC\n"
                            + "@ATTRIBUTE a16 NUMERIC\n"
                            + "@ATTRIBUTE a17 NUMERIC\n"
                            + "@ATTRIBUTE a18 NUMERIC\n"
                            + "@ATTRIBUTE a19 NUMERIC\n"
                            + "@ATTRIBUTE a20 NUMERIC\n"
                            + "@ATTRIBUTE a21 NUMERIC\n"
                            + "@ATTRIBUTE a22 NUMERIC\n"
                            + "@ATTRIBUTE a23 NUMERIC\n"
                            + "@ATTRIBUTE a24 NUMERIC\n"
                            + "@ATTRIBUTE a25 NUMERIC\n"
                            + "@
}