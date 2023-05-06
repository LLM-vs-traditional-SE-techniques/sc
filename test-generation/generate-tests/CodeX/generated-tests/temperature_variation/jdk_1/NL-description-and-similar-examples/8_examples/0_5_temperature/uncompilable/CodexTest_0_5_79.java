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


public class CodexTest_0_5_79 { 
  @Test
    public void testRemove() {
        final int size = 3;
        final Object[] es = new Object[size];
        final Object[] expected = new Object[size - 1];
        for (int i = 0; i < size; i++) {
            es[i] = new Object();
            if (i < size - 1) {
                expected[i] = es[i];
            }
        }
        final Object removed = es[size - 1];
        Assert.assertSame(removed, ArrayUtils.remove(es, size - 1));
        Assert.assertArrayEquals(expected, es);
    }
}