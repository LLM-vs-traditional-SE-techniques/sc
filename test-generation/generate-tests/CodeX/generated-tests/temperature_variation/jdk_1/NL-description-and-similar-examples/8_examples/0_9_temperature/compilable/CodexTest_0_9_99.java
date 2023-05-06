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


public class CodexTest_0_9_99 { 
  @Test
    public void testRemoveViaIterator() {
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }
        final Iterator<Integer> iter = list.iterator();
        for (int i = 0; i < 5; ++i) {
            iter.next();
            iter.remove();
        }
        assertEquals(5, list.size());
        for (int i = 0; i < 5; ++i) {
            assertEquals(i + 5, (int) list.get(i));
        }
    }
}