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


public class CodexTest_0_7_1 { 
  @Test
    public void testRemoveObjectInt() {
        // Regression for HARMONY-634
        List<String> al = new ArrayList<String>();
        al.add("1");
        al.add("2");
        al.add("3");
        assertEquals("1", al.remove(0));
        assertEquals("2", al.remove(0));
        al.add("4");
        assertEquals("3", al.remove(0));
        assertEquals("4", al.remove(0));
        try {
            al.remove(-1);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
            //expected
        }
    }
}