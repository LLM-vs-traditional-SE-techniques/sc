import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_43 { 
  @Test
  public static void doubleTest28() {
			double[] data={1,2,3,4,5,6};
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix1D res = vector.like(matrix.rows());
}