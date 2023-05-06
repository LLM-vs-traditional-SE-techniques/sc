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
    public void testDihedralToMatrix3() {
		Quaternion q0 = new Quaternion(Matrix3.ABSOLUTE);
		Matrix3 m0 = q0.dihedralToMatrix3();
}