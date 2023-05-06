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


public class CodexTest_0_9_5 { 
  @Test
    public void testContains(){
        DenseDoubleMatrix2D matrix2D = new DenseDoubleMatrix2D(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        DenseDoubleMatrix1D matrix1D = new DenseDoubleMatrix1D(new double[]{1,2,3});
        assertEquals(true, matrix2D.contains(condition));
        assertEquals(true, matrix1D.contains(condition));
    }

}