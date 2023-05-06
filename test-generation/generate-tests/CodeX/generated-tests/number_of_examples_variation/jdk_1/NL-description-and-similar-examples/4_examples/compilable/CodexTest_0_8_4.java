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


public class CodexTest_0_8_4 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(Integer.valueOf(2), list.remove(1));
        assertEquals(Arrays.asList(1, 3), list);
        assertEquals(Integer.valueOf(3), list.remove(1));
        assertEquals(Collections.singletonList(1), list);
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertTrue(list.isEmpty());
        try {
            list.remove(0);
            fail("should throw exception");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}