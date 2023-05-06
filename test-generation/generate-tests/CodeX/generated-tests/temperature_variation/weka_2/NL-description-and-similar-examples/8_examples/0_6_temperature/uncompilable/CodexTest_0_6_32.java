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


public class CodexTest_0_6_32 { 
  @Test
       public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
            "Relation Test\n"
            + "Attributes\n"
            + "class numeric\n"
            + "x numeric\n"
            + "y numeric\n"
            + "z numeric\n"
            + "end\n"
            + "Data\n"
            + "0, 1, 2, 3\n"
            + "0, 2, 3, 4\n"
            + "0, 3, 4, 5\n"
            + "0, 4, 5, 6\n"
            + "0, 5, 6, 7\n"
            + "0, 6, 7, 8\n"
            + "0, 7, 8, 9\n"
            + "0, 8, 9, 10\n"
            + "0, 9, 10, 11\n"
            + "0, 10, 11, 12\n"
            + "0, 11, 12, 13\n"
            + "0, 12, 13, 14\n"
            + "0, 13, 14, 15\n"
            + "0, 14, 15, 16\n"
            + "0, 15, 16, 17\n"
            + "0, 16, 17, 18\n"
            + "0, 17, 18, 19\n"
            + "0, 18, 19, 20\n"
            + "0, 19, 20, 21\n"
            + "0, 20, 21, 22\n"
            + "0, 21, 22, 23\n"
            + "0, 22, 23, 24\n"
            + "0, 23, 24, 25\n"
            + "0, 24, 25, 26\n"
            + "0, 25, 26, 27\n"
            + "0, 26, 27, 28\n"
            + "0, 27, 28, 29\n"
            + "0, 28, 29, 30\n"
            + "0, 29, 30, 31
}