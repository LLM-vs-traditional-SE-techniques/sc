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


public class CodexTest_0_4_7 { 
  @Test
    public void testAdd() {
	AlgVector v1 = new AlgVector(3);
	AlgVector v2 = new AlgVector(3);
	AlgVector v3 = new AlgVector(3);
	AlgVector v4 = new AlgVector(3);
	AlgVector v5 = new AlgVector(3);
	AlgVector v6 = new AlgVector(3);
	AlgVector v7 = new AlgVector(3);
	AlgVector v8 = new AlgVector(3);
	AlgVector v9 = new AlgVector(3);
	v1.set(0, 1.0);
	v1.set(1, 2.0);
	v1.set(2, 3.0);
	v2.set(0, 2.0);
	v2.set(1, 3.0);
	v2.set(2, 4.0);
	v3.set(0, 3.0);
	v3.set(1, 4.0);
	v3.set(2, 5.0);
	v4.set(0, 4.0);
	v4.set(1, 5.0);
	v4.set(2, 6.0);
	v5.set(0, 5.0);
	v5.set(1, 6.0);
	v5.set(2, 7.0);
	v6.set(0, 6.0);
	v6.set(1, 7.0);
	v6.set(2, 8.0);
	v7.set(0, 7.0);
	v7.set(1, 8.0);
	v7.set(2, 9.0);
	v8.set(0, 8.0);
	v8.set(1, 9.0);
	v8.set(2, 10.0);
	v9.set(0, 9.0);
	v9.set(1, 10.0);
	v9.set(2, 11.0);
	Assert.assertEqu
}