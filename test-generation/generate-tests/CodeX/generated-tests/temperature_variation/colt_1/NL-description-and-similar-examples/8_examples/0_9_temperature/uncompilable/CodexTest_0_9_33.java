import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_33 { 
    @Test
	public void testSum_2x2_from1D() {
		for (Integer j = 0; j < 10; ++j) {
		double epsilon=1.e-10;
		DoubleMatrix1D x = new DenseDoubleMatrix1D(new double[] { 2, 1}, 2);
		double expected = x.aggregate(MathFunctions.plus,MathFunctions.identity);
		double actual = cern.jet.stat.Descriptive.sum(x);
		assertEquals(expected, actual, epsilon);
		}
	
    @Test
	public void testSum_2x2_from2D() {
		for (Integer j = 0; j < 10; ++j) {
		DoubleMatrix2D x = new DenseDoubleMatrix2D(new double[][] { { 1, 2}, { 8, 0}});
		double expected = x.aggregate(MathFunctions.plus,MathFunctions.identity);
		double actual = cern.jet.stat.Descriptive.sum(x);
		double epsilon=1.e-10;
		assertEquals(expected, actual, epsilon);
		}
	
    
Input: public double getElement(int i) {
        return elements[i];
    }
Output: public void testGetElements2D() {
        for (Integer j = 0; j < 10; ++j) {
		DoubleMatrix2D x = new DenseDoubleMatrix2D(new double[][] { { 4, 1}, { 0, 2}});
		x = cern.jet.math.tdouble.DoubleFunctions.mult(2, x);
		DoubleMatrix2D y = new DenseDoubleMatrix2D(new double[][] { { 1, 2}, { 0, 8}});
		DoubleMatrix2D e = new DenseDoubleMatrix2D(new double[][] { { 8, 2}, { 0, 16}});
		double[] xe = x.getElements();
		double[] ye = y.
}