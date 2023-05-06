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


public class CodexTest_0_7_4 { 
  @Test
    public void testRemove() {
        Object[] array = new Object[] { "a", "b", "c" };
        List<Object> list = new ArrayList<Object>(Arrays.asList(array));
        list.remove(0);
        array = list.toArray();
        assertEquals(array.length, 2);
        assertEquals(array[0], "b");
        assertEquals(array[1], "c");
    }
}