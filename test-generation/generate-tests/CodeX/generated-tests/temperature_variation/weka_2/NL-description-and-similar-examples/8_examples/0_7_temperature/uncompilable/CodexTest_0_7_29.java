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


public class CodexTest_0_7_29 { 
  @Test
    public void testAsInstance() {
        try {
            double[] values = { 3, 2, 5 };
            AlgVector v = new AlgVector(values);
            Instances data = new Instances(new StringReader(
                    "@@relation test\n"
                            + "@@attribute a1 numeric\n"
                            + "@@attribute a2 numeric\n"
                            + "@@attribute a3 numeric\n"
                            + "@@attribute a4 numeric\n"
                            + "@@attribute a5 numeric\n"
                            + "@@attribute a6 numeric\n"
                            + "@@attribute a7 numeric\n"
                            + "@@attribute a8 numeric\n"
                            + "@@attribute a9 numeric\n"
                            + "@@attribute a10 numeric\n"
                            + "@@attribute a11 numeric\n"
                            + "@@attribute a12 numeric\n"
                            + "@@attribute a13 numeric\n"
                            + "@@attribute a14 numeric\n"
                            + "@@attribute a15 numeric\n"
                            + "@@attribute a16 numeric\n"
                            + "@@attribute a17 numeric\n"
                            + "@@attribute a18 numeric\n"
                            + "@@attribute a19 numeric\n"
                            + "@@attribute a20 numeric\n"
                            + "@@attribute a21 numeric\n"
                            + "@@attribute a22 numeric\n"
                            + "@@attribute a23 numeric\n"
                            + "@@attribute a24 numeric\n"
                            + "@@attribute a25 numeric\n"
                            + "@@attribute a26 numeric\n"
                            + "@@attribute a27 numeric\n"
                            + "@@attribute a28 numeric\n"
                            + "@@attribute a29 numeric\n"
                            + "@@attribute a30 numeric\n"
                            + "@@attribute a31 numeric\n"
                            + "@@attribute a32 numeric\n"
                            + "@@attribute a33 numeric\n"
                            + "@@attribute a34
}