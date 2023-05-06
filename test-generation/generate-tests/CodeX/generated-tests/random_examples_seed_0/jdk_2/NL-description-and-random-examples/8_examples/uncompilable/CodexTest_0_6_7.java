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


public class CodexTest_0_6_7 { 
     @Test
      public void testContains() {
          double[] values = {2.3, 1.2, 5.0};
          DenseDoubleMatrix1D d1Double = new DenseDoubleMatrix1D(values);
          assertTrue(d1Double.contains(2.3));
          assertFalse(d1Double.contains(3.3));
      }
}