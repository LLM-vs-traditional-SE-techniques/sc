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


public class CodexTest_0_9_2 { 
  @Test
    public void testAddObjectIndex() {
        // Test for method boolean java.util.ArrayList.add(java.lang.Object, int)
        Object[] o = new Object[1000];
        for (int i = 0; i < 1000; i++)
            o[i] = Integer.toString(i);
        al.add(500, null);
        for (int i = 0; i < 1000; i++)
            if (i == 500)
                assertTrue("Failed to add Object", al.get(i) == null);
            else
                assertTrue("Failed to add Object", al.get(i).equals(o[i]));
    }
}