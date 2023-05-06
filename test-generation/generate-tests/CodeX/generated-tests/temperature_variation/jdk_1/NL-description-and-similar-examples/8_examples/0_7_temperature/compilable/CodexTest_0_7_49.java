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


public class CodexTest_0_7_49 { 
  @Test
    public void testRemove_int() {
		ArrayList list = new ArrayList();
		for (int i = 0; i < 100; i++) {
			list.add(new Integer(i));
		}
		for (int i = 0; i < 100; i++) {
			assertEquals(new Integer(i), list.remove(0));
			assertEquals(list.size(), 99 - i);
		}
	}
}