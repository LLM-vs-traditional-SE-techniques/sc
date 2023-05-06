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


public class CodexTest_0_5_21 { 
  @Test
    public void testRemove() {
			final int[] data = { 1, 2, 3, 4, 5 };
			final Integer[] boxed = new Integer[data.length];
			for (int i = 0; i < data.length; ++i) {
				boxed[i] = Integer.valueOf(data[i]);
			}
			final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(boxed));
			final int removed = list.remove(2).intValue();
			Assert.assertEquals(data.length - 1, list.size());
			Assert.assertEquals(3, removed);
			int k = 0;
			for (final Integer i : list) {
				if (k == 2) {
					++k;
				}
				Assert.assertEquals(data[k++], i.intValue());
			}
		}
}