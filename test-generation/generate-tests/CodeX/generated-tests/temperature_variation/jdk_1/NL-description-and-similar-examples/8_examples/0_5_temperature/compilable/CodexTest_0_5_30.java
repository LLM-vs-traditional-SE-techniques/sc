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


public class CodexTest_0_5_30 { 
  @Test
    public void testRemoveIndex() {
        final List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
        Assert.assertEquals(Integer.valueOf(5), list.remove(0));
        Assert.assertEquals(Arrays.asList(6, 7, 8, 9), list);
        Assert.assertEquals(Integer.valueOf(9), list.remove(3));
        Assert.assertEquals(Arrays.asList(6, 7, 8), list);
        Assert.assertEquals(Integer.valueOf(7), list.remove(1));
        Assert.assertEquals(Arrays.asList(6, 8), list);
        Assert.assertEquals(Integer.valueOf(8), list.remove(1));
        Assert.assertEquals(Arrays.asList(6), list);
        Assert.assertEquals(Integer.valueOf(6), list.remove(0));
        Assert.assertEquals(Arrays.asList(), list);
    }
}