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


public class CodexTest_0_5_1 { 
  @Test
    public void testContains() {
        List<E> list = newArrayList();
        assertFalse(list.contains(null));
        assertFalse(list.contains("string"));
        list.add(null);
        assertTrue(list.contains(null));
        assertFalse(list.contains("string"));
        list.add("string");
        assertTrue(list.contains(null));
        assertTrue(list.contains("string"));
        assertFalse(list.contains("foo"));
    }

}