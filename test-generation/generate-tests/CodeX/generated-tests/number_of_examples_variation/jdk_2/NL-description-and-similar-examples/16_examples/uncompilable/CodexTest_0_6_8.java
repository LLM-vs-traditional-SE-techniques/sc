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


public class CodexTest_0_6_8 { 
  @Test
    public void testContains() {
        DoubleMatrix2D mat = new DenseDoubleMatrix2D(new double[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } });
        assertTrue(mat.contains(1.0));
        assertTrue(mat.contains(2.0));
        assertTrue(mat.contains(3.0));
        assertTrue(mat.contains(4.0));
        assertTrue(mat.contains(5.0));
        assertTrue(mat.contains(6.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains(0.0));
        assertTrue(mat.contains
}