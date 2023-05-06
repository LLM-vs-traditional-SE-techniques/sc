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


public class CodexTest_0_9_36 { 
  @Test
    public void testSubspacesWithPirouettePermutation() {
				// get the matrix of a given subspace, with all vectors
				// organized in a matrix
			final double[][] matSubspace1 = subspace1.getMatrix();
			final double[][] matSubspace2 = subspace2.getMatrix();
			
				// select a pair of pirouettes
			final Tensor<Integer> tirouette1 = subspace1.getTenseurSuivant(3);
			final Tensor<Integer> tirouette2 = subspace2.getTenseurSuivant(0);
			final Integer[] pirouettes1 = tirouette1.getValues();
			final Integer[] pirouettes2 = tirouette2.getValues();
			
				// compute the pirouette matrix
			final double[][] matPirouette1 = pirouette(matSubspace1, pirouettes1);
			final double[][] matPirouette2 = pirouette(matSubspace2, pirouettes2);
			
				// check if the products are transpositions
			double[][] temp = multiply(matPirouette1, matPirouette2);
			double[][] permutation = multiply(temp, matPirouette1);
			boolean isIdentity = isIdentity(permutation);
			assertTrue("Result is not identity", isIdentity);
		}
}