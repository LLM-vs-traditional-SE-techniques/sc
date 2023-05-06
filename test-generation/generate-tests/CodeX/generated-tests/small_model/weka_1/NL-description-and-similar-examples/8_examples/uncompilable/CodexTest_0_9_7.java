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


public class CodexTest_0_9_7 { 
  @Test
    public void testAdd() {
        AlgVector vectorA = new AlgVector(new double[]{1,2,3});
        AlgVector vectorB = new AlgVector(new double[]{3,2,1});
        AlgVector vectorResult = new AlgVector(3);
        vectorResult.m_Elements[0] = 4;
        vectorResult.m_Elements[1] = 4;
        vectorResult.m_Elements[2] = 4;
        vectorResult = vectorA.add(vectorB);
}