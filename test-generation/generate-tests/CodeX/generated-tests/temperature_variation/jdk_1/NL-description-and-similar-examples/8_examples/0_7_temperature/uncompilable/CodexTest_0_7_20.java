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


public class CodexTest_0_7_20 { 
  @Test
    public void testRemove() {
        Assert.assertEquals((Integer) 1, list.remove(0));
        Assert.assertEquals((Integer) 3, list.remove(1));
        Assert.assertEquals((Integer) 2, list.remove(0));
        Assert.assertEquals(0, list.size());
    }
    
Input: public Object remove(int index) {
        Objects.checkIndex(index, size);
        final Object[] es = elementData;
        @SuppressWarnings("unchecked") Object oldValue = (Object) es[index];
        fastRemove(es, index);
        return oldValue;
    }
Output: public void testRemove() {
			Object o = new Object();
			list.add(o);
			assertTrue(list.remove(o));
			assertTrue(list.isEmpty());
		}
}