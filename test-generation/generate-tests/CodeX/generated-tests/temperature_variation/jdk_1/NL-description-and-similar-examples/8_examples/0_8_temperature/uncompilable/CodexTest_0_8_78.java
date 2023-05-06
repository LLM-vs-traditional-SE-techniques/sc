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


public class CodexTest_0_8_78 { 
  @Test
        public void testRemoveByIndex() {
			Vector<Integer> v = new Vector<Integer>();
			Vector<Integer> expected = new Vector<Integer>();
			int[] random = new int[1000];
			Random generator = new Random(248);
			for (int i = 0; i < 1000; i++) {
				int r = generator.nextInt(9999);
				v.add(r);
				expected.add(r);
				random[i] = r;
			}
			Collections.sort(expected);
}