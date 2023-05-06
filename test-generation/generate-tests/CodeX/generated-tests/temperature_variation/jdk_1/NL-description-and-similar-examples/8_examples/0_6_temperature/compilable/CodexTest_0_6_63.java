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


public class CodexTest_0_6_63 { 
  @Test
    public void testRemove() {
        // Regression for HARMONY-59
        Vector v = new Vector();
        v.add(new Integer(1));
        v.add(new Integer(2));
        v.add(new Integer(3));
        v.add(new Integer(4));
        v.add(new Integer(5));
        v.add(new Integer(6));
        v.add(new Integer(7));
        v.add(new Integer(8));
        v.add(new Integer(9));
        v.add(new Integer(10));
        v.add(new Integer(11));
        v.add(new Integer(12));
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        v.remove(0);
        assertEquals("The Vector should be empty", 0, v.size());
    }
}