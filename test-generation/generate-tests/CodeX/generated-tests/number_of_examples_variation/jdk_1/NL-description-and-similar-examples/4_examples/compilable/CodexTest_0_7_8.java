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


public class CodexTest_0_7_8 { 
  @Test
    	public void testRemove() {
        Object o = "one";
        Object o2 = "two";
        Object o3 = "three";
        Object o4 = "four";
        Object o5 = "five";
        Object o6 = "six";
        Object o7 = "seven";
        ArrayList<Object> l = new ArrayList<Object>();
        l.add(o);
        l.add(o2);
        l.add(o3);
        l.add(o4);
        l.add(o5);
        l.add(o6);
        l.add(o7);
        Object removed = l.remove(2);
        assertEquals(o3, removed);
        assertEquals(6, l.size());
    }
}