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


public class CodexTest_0_6_81 { 
  @Test
    public void testRemoveRange() {
        final List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.removeRange(2, 7);
        assertEquals(Arrays.asList(0, 1, 7, 8, 9), list);
        assertEquals(Integer.valueOf(7), list.get(2));
        assertEquals(Integer.valueOf(8), list.get(3));
        assertEquals(Integer.valueOf(9), list.get(4));
        assertEquals(5, list.size());
    }
}