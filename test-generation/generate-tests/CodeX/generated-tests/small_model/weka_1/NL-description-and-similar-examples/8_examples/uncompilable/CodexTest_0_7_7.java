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


public class CodexTest_0_7_7 { 
    @Test
    public void testClone() {
        final int N = 100;
        final AlgVector[] vectors = new AlgVector[N];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new AlgVector(N);
        }
        final AlgVector[] vectors2 = new AlgVector[N];
        for (int i = 0; i < vectors2.length; i++) {
            vectors2[i] = vectors[i].clone();
        }
        for (int i = 0; i < vectors.length; i++) {
            assertEquals(vectors[i], vectors2[i]);
        }
    }
}