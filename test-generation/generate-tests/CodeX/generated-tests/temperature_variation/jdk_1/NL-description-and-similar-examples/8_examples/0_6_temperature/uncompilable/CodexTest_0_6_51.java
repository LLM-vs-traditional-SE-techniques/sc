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


public class CodexTest_0_6_51 { 
  @Test
    public void testRemoveRange() {
        Object[] a = new Object[SIZE];
        Arrays.fill(a, "A");
        List<Object> list = new ArrayList<Object>(Arrays.asList(a));
        Assert.assertEquals("A", list.remove(0));
        Assert.assertEquals("A", list.remove(list.size() - 1));
        a = list.toArray();
        for (int i = 0; i < a.length; i++) {
            Assert.assertEquals("A", a[i]);
        }
    }
}