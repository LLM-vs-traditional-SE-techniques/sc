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


public class CodexTest_0_5_92 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[] { "A", "B", "C", "D", "E" };
        List<Object> list = Arrays.asList(a);
        list.remove(2);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("D", list.get(2));
        Assert.assertEquals("E", list.get(3));
    }
}