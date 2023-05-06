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


public class CodexTest_0_5_47 { 
  @Test
    public void testRemove() {
        final Object[] es = elementData(list);
        final int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(i);
            assertEquals(size - i - 1, list.size());
            assertEquals(size - i - 1, es.length);
            for (int j = i; j < es.length; j++) {
                assertSame(es[j + 1], list.get(j));
            }
        }
    }
}