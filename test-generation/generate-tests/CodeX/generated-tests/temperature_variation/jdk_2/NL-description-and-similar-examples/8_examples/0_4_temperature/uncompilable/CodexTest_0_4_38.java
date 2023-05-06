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


public class CodexTest_0_4_38 { 
  @Test
    public void testContains() {
        Object[] a = {a, b, c, d, e, f, g, h, i, j, k};
        FastList l = new FastList(a);
        assertTrue(l.contains(a));
        assertTrue(l.contains(e));
        assertTrue(l.contains(k));
        assertFalse(l.contains(A));
        assertFalse(l.contains(null));
    }
}