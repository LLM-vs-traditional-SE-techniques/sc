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


public class CodexTest_0_9_26 { 
  @Test
        public void test32() {
			Object[] a = new Object[] {1};
			ArrayList<Object> l = new ArrayList<Object>();
			l.addAll(Arrays.asList(a));
			Object[] expected = l.toArray();
			for (int i = 0; l.size() > 0; i++) {
				assertEquals(expected[i], l.remove(0));
			}
			assertEquals(0, l.size());
		}
}