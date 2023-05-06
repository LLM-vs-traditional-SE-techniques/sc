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


public class CodexTest_0_8_80 { 
  @Test
    public void testRemoveAtZero() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(11);
        a.add(22);
        a.add(37);
        Assert.assertEquals(11, a.remove(2).intValue());
        Assert.assertEquals(3, a.get(0).intValue());
        Assert.assertEquals(7, a.get(1).intValue());
        Assert.assertEquals(22, a.get(2).intValue());
        Assert.assertEquals(37, a.get(3).intValue());
        Assert.assertEquals(4, a.size());
    }
}