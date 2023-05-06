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


public class CodexTest_0_6_1 { 
  @Test
    public void testContains() throws Exception {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        Vector1D[] array = { v1, v2 };
        List<Vector1D> l = new ArrayList<Vector1D>();
        l.add(v1);
        l.add(v2);
        Assert.assertTrue(l.contains(v1));
        Assert.assertTrue(l.contains(v2));
        Assert.assertFalse(l.contains(new Vector1D(3)));
        Assert.assertTrue(Arrays.asList(array).contains(v1));
        Assert.assertTrue(Arrays.asList(array).contains(v2));
        Assert.assertFalse(Arrays.asList(array).contains(new Vector1D(3)));
    }
}