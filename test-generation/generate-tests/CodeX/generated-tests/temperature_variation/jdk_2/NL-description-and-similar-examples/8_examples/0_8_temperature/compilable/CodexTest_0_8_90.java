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


public class CodexTest_0_8_90 { 
  @Test
    public void testContains() {
        Object o1 = new Object();
        Object o2 = new Object();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(o1);
        assertTrue("contains", list.contains(o1));
        assertFalse("contains", list.contains(o2));
    }
}