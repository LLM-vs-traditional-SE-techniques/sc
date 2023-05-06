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


public class CodexTest_0_3_49 { 
  @Test
    public void testRemove() {
        final Object[] es = elementData(new ArrayList<Object>(Arrays.asList(1, 2, 3, 4, 5)));
        final Object[] expected = {1, 2, 4, 5};
        final int index = 2;
        final Object removed = es[index];
        final Object[] actual = remove(es, index);
        assertArrayEquals(expected, actual);
        assertEquals(removed, 3);
    }
}