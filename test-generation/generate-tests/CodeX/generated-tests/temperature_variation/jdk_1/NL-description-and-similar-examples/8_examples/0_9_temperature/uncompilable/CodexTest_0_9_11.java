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


public class CodexTest_0_9_11 { 
  @Test
    public void testRemove() {
			ArrayList list = new ArrayList();
			list.add(new Integer(1));
			list.add(new Integer(2));
			list.add(new Integer(3));
			list.add(new Integer(4));
			list.add(new Integer(5));
			list.add(new Integer(6));
			list.add(new Integer(7));
			list.add(new Integer(8));
			list.add(new Integer(9));
			list.add(new Integer(10));
			
			AssertJUnit.assertEquals(new Integer(10), list.remove(9));
			AssertJUnit.assertEquals(new Integer(2), list.remove(1));
			AssertJUnit.assertEquals(new Integer(4), list.remove(2));
			AssertJUnit.assertEquals(new Integer(6), list.remove(3));
			AssertJUnit.assertEquals(new Integer(8), list.remove(4));
		}
}