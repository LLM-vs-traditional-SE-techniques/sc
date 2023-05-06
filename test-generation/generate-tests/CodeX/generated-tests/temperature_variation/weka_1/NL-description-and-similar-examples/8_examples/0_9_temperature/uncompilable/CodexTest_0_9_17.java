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


public class CodexTest_0_9_17 { 
  @Test
     public void testAddVector() {
    int n = 21;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    AlgVector c = new AlgVector(n);
    a.setElement(0, 1.3);
    a.setElement(1, 1.2);
    a.setElement(2, 1.1);
    a.setElement(3, 1.0);
    a.setElement(4, 0.9);
    a.setElement(5, 0.8);
    a.setElement(6, 0.7);
    a.setElement(7, 0.6);
    a.setElement(8, 0.5);
    a.setElement(9, 0.4);
    a.setElement(10, 0.3);
    a.setElement(11, 0.2);
    a.setElement(12, 0.1);
    a.setElement(13, 0.0);
    a.setElement(14, -0.1);
    a.setElement(15, -0.2);
    a.setElement(16, -0.3);
    a.setElement(17, -0.4);
    a.setElement(18, -0.5);
    a.setElement(19, -0.6);
    a.setElement(20, -0.7);
    b.setElement(0, 1.3);
    b.setElement(1, 1.2);
    b.setElement(2, 1.1);
    b.setElement(3, 1.0);
    b.setElement(4, 0.9);
    b.setElement(5, 0.8);
    b.setElement(6, 0.7);
    b.setElement(7, 0.6);
    b.setElement(8, 0.5);
    b.setElement(9, 0.4);
    b.setElement(10, 0.3);
    b.setElement(11, 0.2);
    b.setElement(
}