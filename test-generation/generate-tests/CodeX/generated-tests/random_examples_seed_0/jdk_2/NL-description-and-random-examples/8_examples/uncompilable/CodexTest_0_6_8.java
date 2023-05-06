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
        DoubleMatrix1D m = new DenseDoubleMatrix1D(new double[]{1, 0, 2, 0, 3, 0, 4});
        Assert.assertTrue(m.contains(3));
        Assert.assertTrue(m.contains(0));
        Assert.assertFalse(m.contains(5));
    }
}