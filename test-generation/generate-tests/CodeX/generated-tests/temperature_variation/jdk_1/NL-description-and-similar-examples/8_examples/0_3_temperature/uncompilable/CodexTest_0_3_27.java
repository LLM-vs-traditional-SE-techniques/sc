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


public class CodexTest_0_3_27 { 
  @Test
    public void testRemove() {
        final Object[] es = elementData(new ArrayList<Object>());
        final Object[] expected = new Object[es.length - 1];
        final Object element = new Object();
        final Object removed = new Object();
        es[0] = element;
        es[1] = removed;
        System.arraycopy(es, 2, expected, 1, es.length - 2);
        assertSame(removed, new ArrayList<Object>().remove(1));
        assertArrayEquals(expected, es);
    }
}