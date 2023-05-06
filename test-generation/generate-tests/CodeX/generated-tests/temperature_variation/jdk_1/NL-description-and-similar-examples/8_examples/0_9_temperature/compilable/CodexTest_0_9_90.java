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


public class CodexTest_0_9_90 { 
  @Test
    public void testRemoveFromEnd() {
        // Regression test for HARMONY-2654
        ArrayList list = new ArrayList(Arrays.asList(new String[] { "0",
                "1" }));
        list.remove(1);
        assertEquals(1, list.size());
        assertEquals("0", list.get(0));
    }
}