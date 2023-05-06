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


public class CodexTest_0_6_19 { 
  @Test
    public void testRemoveByIndex() {
			ArrayList<String> l = new ArrayList<>();
			l.add("foo");
			l.add("bar");
			l.add("baz");
			assertEquals("bar", l.remove(1));
			assertEquals("foo", l.get(0));
			assertEquals("baz", l.get(1));
		}
		
Input: public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
Output: public void testAddOne() {
			ArrayList<String> l = new ArrayList<>();
			l.add("foo");
			assertEquals(1, l.size());
			assertEquals("foo", l.get(0));
		}
		
Input: public void add(int index, E element) {
        rangeCheckForAdd(index);
}