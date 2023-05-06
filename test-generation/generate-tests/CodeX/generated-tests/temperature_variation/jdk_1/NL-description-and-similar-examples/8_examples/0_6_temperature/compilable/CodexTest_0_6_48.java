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


public class CodexTest_0_6_48 { 
  @Test
      public void testRemove() {
        Object[] data = new Object[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        List<Object> list = Arrays.asList(data);
        assertEquals(data.length, list.size());
        assertEquals("1", list.remove(1));
        assertEquals(data.length - 1, list.size());
        assertEquals("3", list.remove(1));
        assertEquals(data.length - 2, list.size());
        assertEquals("5", list.remove(1));
        assertEquals(data.length - 3, list.size());
        assertEquals("7", list.remove(1));
        assertEquals(data.length - 4, list.size());
        assertEquals("9", list.remove(1));
        assertEquals(data.length - 5, list.size());
    }
}