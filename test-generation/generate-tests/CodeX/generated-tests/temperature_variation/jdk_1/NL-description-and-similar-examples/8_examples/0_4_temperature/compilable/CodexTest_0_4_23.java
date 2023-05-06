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


public class CodexTest_0_4_23 { 
  @Test
    public void testRemove() {
        Object[] elements = new Object[3];
        elements[0] = "0";
        elements[1] = "1";
        elements[2] = "2";
        ArrayList<Object> al = new ArrayList<Object>(Arrays.asList(elements));
        assertEquals("0", al.remove(0));
        assertEquals(2, al.size());
        assertEquals("1", al.get(0));
        assertEquals("2", al.get(1));
    }
}