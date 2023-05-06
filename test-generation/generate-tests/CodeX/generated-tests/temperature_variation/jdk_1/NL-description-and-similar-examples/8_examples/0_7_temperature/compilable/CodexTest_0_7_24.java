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


public class CodexTest_0_7_24 { 
  @Test
    public static void testRemove() {
        Object[] data = new Object[] { "one", "two", "three" };
        List<Object> list = new ArrayList<Object>(Arrays.asList(data));
        assertTrue(list.remove(data[1]));
        assertFalse(list.remove("four"));
        assertEquals(2, list.size());
        assertEquals(Arrays.asList(data[0], data[2]), list);
    }
}