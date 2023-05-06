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


public class CodexTest_0_9_5 { 
  @Test
  public void testRemoveConformByContract() {
        Object e1 = new Object();
        Object e2 = new Object();
        Object e3 = new Object();
        Object e4 = new Object();
        List<Object> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e2);
        Assert.assertSame(e2, list.remove(1));
        Assert.assertSame(e3, list.remove(1));
        list.add(0, e4);
        Assert.assertSame(e4, list.get(0));
        Assert.assertSame(e2, list.get(1));
        Assert.assertSame(e1, list.get(2));
    }

}