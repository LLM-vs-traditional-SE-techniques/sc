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


public class CodexTest_0_5_46 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        Assert.assertEquals("1", list.remove(0));
        Assert.assertEquals("10", list.remove(list.size() - 1));
        Assert.assertEquals("5", list.remove(list.size() / 2));
        Assert.assertEquals("2", list.remove(0));
        Assert.assertEquals("4", list.remove(0));
        Assert.assertEquals("6", list.remove(0));
        Assert.assertEquals("8", list.remove(0));
        Assert.assertEquals("3", list.remove(0));
        Assert.assertEquals("7", list.remove(0));
        Assert.assertEquals("9", list.remove(0));
        Assert.assertEquals(0, list.size());
    }
}