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


public class CodexTest_0_4_15 { 
  @Test
    public void testRemove() {
        final Integer[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(data));
        assertEquals(Integer.valueOf(5), list.remove(5));
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 6, 7, 8, 9), list);
        assertEquals(Integer.valueOf(0), list.remove(0));
        assertEquals(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9), list);
        assertEquals(Integer.valueOf(9), list.remove(list.size() - 1));
        assertEquals(Arrays.asList(1, 2, 3, 4, 6, 7, 8), list);
    }
}