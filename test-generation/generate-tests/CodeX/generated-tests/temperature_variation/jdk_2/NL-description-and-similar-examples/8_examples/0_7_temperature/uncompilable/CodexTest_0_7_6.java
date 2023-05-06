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


public class CodexTest_0_7_6 { 
  @Test
    /**
     * Test of method contains.
     */
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        DataList instance = new DataList();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}