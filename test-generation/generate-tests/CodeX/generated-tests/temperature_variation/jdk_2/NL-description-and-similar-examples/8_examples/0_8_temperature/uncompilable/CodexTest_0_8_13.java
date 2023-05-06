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


public class CodexTest_0_8_13 { 
  @Test
  public void testContainsWithDouble() {
        Double[] a = { new Double(4.0), new Double(5.0), new Double(6.0) };
        FastList<Double> c = new FastList<Double>(a);
        assertFalse(c.contains(new Double(1.0)));
        assertTrue(c.contains(new Double(4.0)));
        assertTrue(c.contains(new Double(6.0)));
        assertFalse(c.contains(new Double(10.0)));
    }
}