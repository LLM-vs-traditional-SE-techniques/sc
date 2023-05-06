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


public class CodexTest_0_5_24 { 
  @Test
    public void testContains() {
        Object[] x = {new Integer(0), new Integer(1), new Integer(2),
                      new Integer(3), new Integer(4), new Integer(5),
                      new Integer(6), new Integer(7), new Integer(8),
                      new Integer(9)};
        ArrayList l = new ArrayList(Arrays.asList(x));
        for (int i = 0; i < x.length; i++)
            assertTrue(l.contains(x[i]));
        assertTrue(!l.contains(new Integer(-1)));
        assertTrue(!l.contains(new Integer(10)));
        assertTrue(!l.contains(null));
    }
```
}