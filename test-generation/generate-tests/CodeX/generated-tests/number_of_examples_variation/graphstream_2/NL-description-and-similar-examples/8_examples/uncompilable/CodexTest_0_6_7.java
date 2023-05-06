import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_7 { 
  @Test
    public static void doubleTest28() {
			double[] data1={1,2,3,4,5,6};
			double[] data2={1,2,3,4,5,6};
			double[][] arrMatrix1 = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			double[][] arrMatrix2 = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector1 = new DenseDoubleMatrix1D(data1);
			DoubleMatrix2D matrix1 = f.make(arrMatrix1);
			DoubleMatrix1D vector2 = new DenseDoubleMatrix1D(data2);
			DoubleMatrix2D matrix2 = f.make(arrMatrix2);
			DoubleMatrix1D res1 = vector1.like(matrix1.rows());
			DoubleMatrix1D res2 = vector2.like(matrix2.rows());
}