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


public class CodexTest_0_7_83 { 
  @Test
  public void testRemove() {
        Object[] a = range(0, 10);
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            int i = it.nextIndex();
            if (i % 2 == 0) {
                it.next();
                it.remove();
            }
        }
        assertEquals(Arrays.asList(1, 3, 5, 7, 9), list);
        assertEquals(Arrays.asList(0, 2, 4, 6, 8), Arrays.asList(a));
    }
}