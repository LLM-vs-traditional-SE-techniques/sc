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


public class CodexTest_0_8_74 { 
    @Test
	public void testRemoveWithoutIterator() {
		LongBag bag = new LongBag();
		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.add(5);
		bag.add(6);
		bag.add(7);
		bag.add(8);
		bag.add(9);
		bag.add(10);
		bag.remove(0);
		bag.remove(3);
		bag.remove(7);
		for (int i = 0; i < bag.size(); i++) {
			assertEquals(((i == 0 || i == 4 || i == 8) ? 1 : i), bag.get(i));
		}
		bag.clear();
		for (int i = 0; i < 20; i++) {
			bag.add(i);
		}
		for (int i = 19; i >= 0; i--) {
			bag.remove(i);
			for (int j = 0; j < i; j++) {
				assertEquals(j, bag.get(j));
			}
		}
	}
}