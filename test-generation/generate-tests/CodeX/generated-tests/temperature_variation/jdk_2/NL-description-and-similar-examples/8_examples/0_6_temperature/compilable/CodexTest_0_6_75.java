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


public class CodexTest_0_6_75 { 
  @Test
    public void testContains() {
        Vector v = new Vector();
        v.addElement(new Integer(0));
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        v.addElement(new Integer(5));
        v.addElement(new Integer(6));
        v.addElement(new Integer(7));
        v.addElement(new Integer(8));
        v.addElement(new Integer(9));
        assertTrue("Should contain 0", v.contains(new Integer(0)));
        assertFalse("Should not contain 10", v.contains(new Integer(10)));
    }
}