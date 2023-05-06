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


public class CodexTest_0_7_47 { 
  @Test
    public void testArrayListRemove() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		assertEquals(5, list.size());
		assertEquals("one", list.get(0));
		assertEquals("two", list.get(1));
		assertEquals("three", list.get(2));
		assertEquals("four", list.get(3));
		assertEquals("five", list.get(4));
		assertEquals("two", list.remove(1));
		assertEquals(4, list.size());
		assertEquals("one", list.get(0));
		assertEquals("three", list.get(1));
		assertEquals("four", list.get(2));
		assertEquals("five", list.get(3));
		assertEquals("four", list.remove(2));
		assertEquals(3, list.size());
		assertEquals("one", list.get(0));
		assertEquals("three", list.get(1));
		assertEquals("five", list.get(2));
		assertEquals("five", list.remove(2));
		assertEquals(2, list.size());
		assertEquals("one", list.get(0));
		assertEquals("three", list.get(1));
		assertEquals("three", list.remove(1));
		assertEquals(1, list.size());
		assertEquals("one", list.get(0));
		assertEquals("one", list.remove(0));
		assertEquals(0, list.size());
	}
}