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


public class CodexTest_0_8_49 { 
  @Test
    public void testRemove() throws Exception {
        String[] expected = strings.clone();
        String removed = l.remove(1);
        assertEquals(list0.length + list1.length + list2.length - 1, l.size());
        assertEquals(expected[1], removed);
        assertTrue(Arrays.equals(
                Stream.concat(Arrays.stream(list0), Stream.concat(
                        Arrays.stream(list1, 1, list1.length),
                        Arrays.stream(list2))).toArray(Object[]::new),
                l.toArray(new String[0])));
    }
}