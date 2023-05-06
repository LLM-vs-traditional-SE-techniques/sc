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


public class CodexTest_0_4_39 { 
  @Test
    public void testRemove() {
        Object[] data = new Object[] { "one", "two", "three", "four" };
        List<Object> list = new ArrayList<Object>(Arrays.asList(data));
        assertEquals("two", list.remove(1));
        assertEquals(Arrays.asList(data[0], data[2], data[3]), list);
    }
}