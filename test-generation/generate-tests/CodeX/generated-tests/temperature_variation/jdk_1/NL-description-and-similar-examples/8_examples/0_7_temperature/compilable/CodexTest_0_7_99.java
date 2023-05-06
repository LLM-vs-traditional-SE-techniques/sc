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


public class CodexTest_0_7_99 { 
  @Test
    public void testRemoveIndex() {
			Object[] a = new Object[] { "foo", "bar", "baz" };
			List<Object> list = Arrays.asList(a);
			Object o = list.remove(2);
			assertSame(o, "baz");
			assertEquals(2, list.size());
		}
}