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


public class CodexTest_0_5_4 { 
  @Test
    public void testRemove() {
        Object x = new Object();
        Object y = new Object();
        Object z = new Object();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(x);
        list.add(y);
        list.add(z);
        list.remove(y);
        assertEquals(2, list.size());
        assertEquals(x, list.get(0));
        assertEquals(z, list.get(1));
    }
}