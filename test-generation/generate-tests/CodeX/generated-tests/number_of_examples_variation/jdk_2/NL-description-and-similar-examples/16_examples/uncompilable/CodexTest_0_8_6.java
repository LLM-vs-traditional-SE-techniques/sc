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


public class CodexTest_0_8_6 { 
  @Test
    public void testContains() {
        DoubleMatrix2D matrix = doubleFactory2D.diagonal(5);
        assertTrue(matrix.contains(-1));
        assertTrue(matrix.contains(-0.0));
        assertTrue(matrix.contains(0.0));
        assertTrue(matrix.contains(0.5));
        assertTrue(matrix.contains(2));
        assertTrue(matrix.contains(2.0));
        assertTrue(matrix.contains(5));
        assertTrue(matrix.contains(5.0));
        assertTrue(matrix.contains(6));
        assertTrue(matrix.contains(6.0));
        assertFalse(matrix.contains(1));
        assertFalse(matrix.contains(1.0));
        assertFalse(matrix.contains(4));
        assertFalse(matrix.contains(4.0));
        assertFalse(matrix.contains(7));
        assertFalse(matrix.contains(7.0));
    }
}