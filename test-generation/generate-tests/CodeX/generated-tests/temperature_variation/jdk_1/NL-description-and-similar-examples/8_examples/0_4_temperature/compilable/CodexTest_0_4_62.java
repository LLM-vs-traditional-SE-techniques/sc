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


public class CodexTest_0_4_62 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(Integer.valueOf(4), list.remove(3));
        assertEquals(Arrays.asList(1, 2, 3, 5), list);
        assertEquals(Integer.valueOf(5), list.remove(3));
        assertEquals(Arrays.asList(1, 2, 3), list);
        assertEquals(Integer.valueOf(2), list.remove(1));
        assertEquals(Arrays.asList(1, 3), list);
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertEquals(Arrays.asList(3), list);
        assertEquals(Integer.valueOf(3), list.remove(0));
        assertEquals(Arrays.asList(), list);
    }
}