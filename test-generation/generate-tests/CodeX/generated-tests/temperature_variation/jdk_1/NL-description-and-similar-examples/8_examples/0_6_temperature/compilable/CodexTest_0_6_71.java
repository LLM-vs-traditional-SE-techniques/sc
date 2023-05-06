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


public class CodexTest_0_6_71 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.remove(1);
        list.remove(3);
        list.remove(5);
        list.remove(7);
        list.remove(9);
        list.remove(11);
        list.remove(13);
        list.remove(15);
        list.remove(17);
        list.remove(19);
        Assert.assertEquals(10, list.size());
        Assert.assertEquals(1, (int) list.get(0));
        Assert.assertEquals(3, (int) list.get(1));
        Assert.assertEquals(5, (int) list.get(2));
        Assert.assertEquals(7, (int) list.get(3));
        Assert.assertEquals(9, (int) list.get(4));
        Assert.assertEquals(11, (int) list.get(5));
        Assert.assertEquals(13, (int) list.get(6));
        Assert.assertEquals(15, (int) list.get(7));
        Assert.assertEquals(17, (int) list.get(8));
        Assert.assertEquals(19, (int) list.get(9));
    }
}