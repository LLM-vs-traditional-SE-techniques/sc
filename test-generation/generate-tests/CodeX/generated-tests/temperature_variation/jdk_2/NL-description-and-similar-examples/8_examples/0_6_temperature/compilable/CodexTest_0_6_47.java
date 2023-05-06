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


public class CodexTest_0_6_47 { 
  @Test
    public void testContains() {
        Object[] x = {
            new Long(0), new Long(1), new Long(2), new Long(3), new Long(4),
            new Long(5), new Long(6), new Long(7), new Long(8), new Long(9)
        };
        List l = new ArrayList(Arrays.asList(x));
        for (int i = 0; i < x.length; i++) {
            assertTrue("Should contain " + x[i], l.contains(x[i]));
        }
        assertTrue("Should not contain " + new Long(-1),
                   !l.contains(new Long(-1)));
        assertTrue("Should not contain " + new Long(10),
                   !l.contains(new Long(10)));
    }
}