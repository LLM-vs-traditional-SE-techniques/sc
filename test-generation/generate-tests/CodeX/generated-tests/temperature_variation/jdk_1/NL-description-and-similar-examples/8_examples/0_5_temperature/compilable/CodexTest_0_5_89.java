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


public class CodexTest_0_5_89 { 
  @Test
   public void testRemove() {
        final Object[] data = new Object[] {
            "a", "b", "c", "d", "e"
        };
        final List<Object> list = new ArrayList<Object>(Arrays.asList(data));
        final Object[] result = new Object[] {
            "a", "b", "d", "e"
        };
        assertEquals(data[2], list.remove(2));
        assertEquals(Arrays.asList(result), list);
        try {
            list.remove(-1);
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        try {
            list.remove(list.size());
            fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }
}