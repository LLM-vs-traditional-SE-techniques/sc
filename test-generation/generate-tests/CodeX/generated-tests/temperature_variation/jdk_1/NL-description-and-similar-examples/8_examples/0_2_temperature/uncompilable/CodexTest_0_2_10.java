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


public class CodexTest_0_2_10 { 
  @Test
    public void testRemove() {
        final Object[] es = elementData(new ArrayList<Object>());
        final Object[] expected = new Object[es.length];
        System.arraycopy(es, 0, expected, 0, es.length);
        final Object o = new Object();
        es[0] = o;
        expected[0] = null;
        assertSame(o, new ArrayList<Object>().remove(0));
        assertArrayEquals(expected, es);
    }
}