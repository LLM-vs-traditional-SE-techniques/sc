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


public class CodexTest_0_8_83 { 
  @Test
  public void testRemove() {
        Object[] elements = { "a", "b", "c" };
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(elements));
        assertEquals(elements.length, list.size());
        Object o = list.remove(1);
        assertEquals(elements.length - 1, list.size());
        assertEquals(elements[1], o);
        assertEquals(elements[2], list.get(1));
  }
}