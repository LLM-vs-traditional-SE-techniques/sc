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


public class CodexTest_0_4_11 { 
  @Test
    public void testRemove() {
        final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        final List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10));
        final List<Integer> actual = new ArrayList<>(list);
        final Integer removed = actual.remove(4);
        assertEquals(removed, Integer.valueOf(5));
        assertEquals(expected, actual);
    }
}