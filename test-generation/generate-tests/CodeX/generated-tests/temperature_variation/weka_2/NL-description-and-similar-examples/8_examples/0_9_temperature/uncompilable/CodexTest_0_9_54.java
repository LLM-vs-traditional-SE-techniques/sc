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


public class CodexTest_0_9_54 { 
  @Test
    public static void doubleTest12() {
		double[][] data={
			{0, 1, 2},
			{1, 2, 3},
			{2, 2, 4}};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix2D matrix = f.make(data);
		matrix.assign(DoubleFunctions.mod(5.0));
}