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


public class CodexTest_0_6_45 { 
  @Test
    public void testRemoveOne() {
        Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        final List<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.remove(0);
        assertEquals(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10), list);
    }
}