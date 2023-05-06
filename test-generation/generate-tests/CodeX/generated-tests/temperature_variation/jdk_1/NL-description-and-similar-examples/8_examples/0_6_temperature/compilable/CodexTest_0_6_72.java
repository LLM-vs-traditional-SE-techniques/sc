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


public class CodexTest_0_6_72 { 
  @Test
    public void testRemove() {
        final List<Integer> list = new ArrayList<>();
        Assert.assertEquals(Integer.valueOf(1), list.remove(0));
        Assert.assertEquals(Integer.valueOf(2), list.remove(1));
        Assert.assertEquals(Integer.valueOf(3), list.remove(2));
        Assert.assertEquals(Integer.valueOf(4), list.remove(3));
        Assert.assertEquals(Integer.valueOf(5), list.remove(4));
        Assert.assertEquals(Integer.valueOf(6), list.remove(5));
        Assert.assertEquals(Integer.valueOf(7), list.remove(6));
        Assert.assertEquals(Integer.valueOf(8), list.remove(7));
        Assert.assertEquals(Integer.valueOf(9), list.remove(8));
    }
}