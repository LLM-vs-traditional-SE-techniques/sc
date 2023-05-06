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


public class CodexTest_0_9_6 { 
  @Test
    public void testContainsShouldReturnTrueWhenPresent() {
        List<Integer> list = newjava.util.ArrayList<Integer>();
        list.add(1);
        list.add(2);
        assertTrue(list.contains(new Integer(1)));
    }
    public void testContainsShouldReturnFalseWhenNotPresent() {
        List<Integer> list = newjava.util.ArrayList<Integer>();
        list.add(1);
        list.add(2);
        assertFalse(list.contains(new Integer(3)));
    }

}