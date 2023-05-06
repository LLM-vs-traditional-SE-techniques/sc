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


public class CodexTest_0_9_7 { 
  @Test
     public void testRemove() {
		Object[] a = new Object[7];
		for (int i = 0; i < 7; i++)
		    a[i] = i;
		Object[] a0 = Arrays.copyOf(a, a.length);
		List<Object> list = Arrays.asList(a);
		for (int i = 0; i < list.size(); i++) {
		    assertTrue(list.contains(i));
		    assertEquals(i, list.get(i));
		    list.remove(i);
		    assertFalse(list.contains(i));
		}
     } 
}