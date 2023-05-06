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


public class CodexTest_0_8_96 { 
  @Test
    public void testContains() {
		List<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		assertTrue(list.contains(a));
		assertTrue(list.contains(b));
		assertTrue(list.contains(c));
		assertFalse(list.contains(d));
		assertFalse(list.contains(1));
		assertFalse(list.contains(0));
		assertFalse(list.contains(null));
	}
}