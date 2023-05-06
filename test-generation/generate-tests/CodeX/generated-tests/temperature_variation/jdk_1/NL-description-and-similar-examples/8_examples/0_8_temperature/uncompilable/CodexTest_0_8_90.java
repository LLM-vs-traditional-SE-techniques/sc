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


public class CodexTest_0_8_90 { 
  @Test
   public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        list.remove(3);
        Assert.assertEquals(9, list.size());
        Assert.assertEquals(1, (int) list.get(0));
        Assert.assertEquals(2, (int) list.get(1));
        Assert.assertEquals(3, (int) list.get(2));
        Assert.assertEquals(5, (int) list.get(3));
        list.remove(3);
        Assert.assertEquals(8, list.size());
        Assert.assertEquals(1, (int) list.get(0));
        Assert.assertEquals(2, (int) list.get(1));
        Assert.assertEquals(3, (int) list.get(2));
        Assert.assertEquals(6, (int) list.get(3));
        Assert.assertEquals(7, (int) list.get(4));
        Assert.assertEquals(8, (int) list.get(5));
        Assert.assertEquals(9, (int) list.get(6));
}