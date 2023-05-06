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


public class CodexTest_0_4_6 { 
  @Test
    public void testRemove() {
			ArrayList<String> list = new ArrayList<String>();
			list.add(0, "foo");
			list.add(1, "bar");
			list.add(2, "baz");
			list.add(3, "qux");
			list.add(4, "quux");
			list.add(5, "corge");
			list.add(6, "grault");
			list.add(7, "garply");
			list.add(8, "waldo");
			list.add(9, "fred");
			list.add(10, "plugh");
			list.add(11, "xyzzy");
			list.add(12, "thud");
			assertEquals("foo", list.remove(0));
			assertEquals("bar", list.remove(0));
			assertEquals("baz", list.remove(0));
			assertEquals("qux", list.remove(0));
			assertEquals("quux", list.remove(0));
			assertEquals("corge", list.remove(0));
			assertEquals("grault", list.remove(0));
			assertEquals("garply", list.remove(0));
			assertEquals("waldo", list.remove(0));
			assertEquals("fred", list.remove(0));
			assertEquals("plugh", list.remove(0));
			assertEquals("xyzzy", list.remove(0));
			assertEquals("thud", list.remove(0));
			assertEquals(0, list.size());
		}
}