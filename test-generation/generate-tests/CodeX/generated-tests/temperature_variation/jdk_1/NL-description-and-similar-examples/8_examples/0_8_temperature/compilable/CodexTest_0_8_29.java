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


public class CodexTest_0_8_29 { 
  @Test
    public void testRemove() {
			final int n = 20;
			Integer[] data = new Integer[n];
			for (int i = 0; i < n; i++) {
				data[i] = i;
			}
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(data));
			int i = 0;
			for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
				Integer element = iter.next();
				assertEquals(i, element.intValue());
				iter.remove();
				i++;
			}
		}
}