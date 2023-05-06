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


public class CodexTest_0_9_6 { 
    @Test
    public void testContains() {
        final int n = 5;
        final LongList list = new LongArrayList();
        for (int i=0; i<n; i++) {
            list.add(i);
        }
        // Test contains
        boolean hasElement = false;
        for (int i=0; i<list.size(); i++) {
            final long element = list.get(i);
            hasElement |= list.contains(element);
        }
        assertTrue(hasElement);
    }
}