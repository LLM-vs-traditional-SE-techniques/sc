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


public class CodexTest_0_9_94 { 
  @Test
  public void testGetAsInstanceDimensions() {
    int rows = 10;
    int cols = 4;
    Matrix m = new Matrix(rows, cols);
    Instances d = new Instances(Vect.extractInstances(m), 0);
    m = new Matrix(d);
}