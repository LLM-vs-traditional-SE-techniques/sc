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


public class CodexTest_0_9_6 { 
  @Test
    public static void testPredictInductiveModelOnRealData() throws Exception {
        final Instance[] trainingSet = new Instance[100];
        final int[] labels = {1, 1, -1, -1, 1, -1, 1, -1, 1, -1, 1, 1, -1, 1,
                1, 1, -1, 1, -1, -1, 1, 1, -1, 1, -1, -1, 1, -1,
}