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


public class CodexTest_0_7_5 { 
  @Test
    // contains(Object)
    public void testContainsObject() {
        java.util.Vector<String> v1 = new java.util.Vector<String>();
        java.util.Vector<String> v2 = new java.util.Vector<String>();
        for (int i=0; i<100; i++) {
            v1.addElement(String.valueOf(i));
        }
        for (int i=0; i<100; i+=2) {
            v2.addElement(String.valueOf(i));
        }
        assertTrue(v1.contains(new Integer(50)));
        assertTrue(v2.contains(new Integer(50)));
        assertTrue(!v1.contains(new Integer(101)));
        assertTrue(!v2.contains(new Integer(101)));
    }
}