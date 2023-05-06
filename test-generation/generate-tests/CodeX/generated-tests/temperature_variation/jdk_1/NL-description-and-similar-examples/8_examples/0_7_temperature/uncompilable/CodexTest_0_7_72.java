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


public class CodexTest_0_7_72 { 
  @Test
    public void testAddAll() {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i=0; i<3; i++) {
            c.add(new Integer(i));
        }
        list.addAll(2, c);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(new Integer(0), list.get(0));
        Assert.assertEquals(new Integer(1), list.get(1));
        Assert.assertEquals(new Integer(0), list.get(2));
        Assert.assertEquals(new Integer(1), list.get(3));
        Assert.assertEquals(new Integer(2), list.get(4));
    }
}