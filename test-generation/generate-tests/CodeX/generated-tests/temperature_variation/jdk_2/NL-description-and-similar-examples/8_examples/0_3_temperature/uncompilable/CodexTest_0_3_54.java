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


public class CodexTest_0_3_54 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector(new double[] {2.3, 1.2, 5.0});
        assertTrue(v.contains(2.3));
        assertTrue(v.contains(1.2));
        assertTrue(v.contains(5.0));
        assertFalse(v.contains(2.4));
        assertFalse(v.contains(1.3));
        assertFalse(v.contains(5.1));
    }
}