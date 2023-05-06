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


public class CodexTest_0_4_5 { 
  @Test
    public void testContains() {
        DoubleMatrix1D m = doubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i = 0; i < m.size(); i++) {
            assertTrue(m.contains(i));
        }
        assertFalse(m.contains(-1));
        assertFalse(m.contains(m.size()));
    }
}