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


public class CodexTest_0_6_8 { 
  @Test
    public void testContains() {
        java.util.List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        Assert.assertTrue(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
        Assert.assertTrue(list.contains("D"));
        Assert.assertTrue(list.contains("E"));
        Assert.assertTrue(list.contains("F"));
        Assert.assertTrue(list.contains("G"));
        Assert.assertTrue(list.contains("H"));
        Assert.assertTrue(list.contains("I"));
        Assert.assertTrue(list.contains("J"));
    }
}