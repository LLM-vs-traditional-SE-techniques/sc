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


public class CodexTest_0_6_2 { 
  @Test
    public void testContains() {
        DenseDoubleMatrix2D a = new DenseDoubleMatrix2D(new double[][] {
                {1, 2, 3},
                {4, 5, 6}
        });
        DenseDoubleMatrix2D b = new DenseDoubleMatrix2D(new double[][] {
                {1, 2, 3},
                {4, 5, 6}
        });
        DenseDoubleMatrix2D c = new DenseDoubleMatrix2D(new double[][] {
                {1, 2, 3},
                {4, 5, 6}
        });
        DoubleMatrix2D d = a.like(2, 2);
        Assert.assertTrue(a.contains(d));
        Assert.assertFalse(a.contains(b));
}