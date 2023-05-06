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


public class CodexTest_0_5_5 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(
                new StringReader(
                "Relation test\n"
                + "Attributes\n"
                + "Numeric\n"
                + "Nominal {a, b}\n"
                + "Numeric\n"
                + "Nominal {c, d}\n"
                + "Data\n"
                + "\n"
                + "0, a, 1, c\n"
                + "1, b, 2, d\n"
                + "2, a, 3, c\n"
                + "3, d, 4, d\n"
                + "4, b, 5, c\n"
                + "5, a, 6, d\n"
                + "6, b, 7, c\n"
                + "7, a, 8, d\n"
                + "8, b, 9, c\n"
                + "9, a, 10, d\n"
                + "10, b, 11, c\n"
                + "11, a, 12, d\n"
                + "12, b, 13, c\n"
                + "13, a, 14, d\n"
                + "14, b, 15, c\n"
                + "15, a, 16, d\n"
                + "16, b, 17, c\n"
                + "17, a, 18, d\n"
                + "18, b, 19, c\n"
                + "19, a, 20, d\n"
                + "20, b, 21, c\n"
                + "21, a, 22, d\n"
                + "22, b, 23, c\n"
                + "23, a, 24, d\n"
                + "24, b, 25, c\n"
                + "25, a, 26, d\n"
                + "26, b, 27, c\n"
                + "27, a, 28, d\n
}