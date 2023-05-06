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


public class CodexTest_0_9_5 { 
  @Test
    
    public void testRemove() {
        final List<Object> list = createList();
        final Object o = new Object();
        list.add(o);
        assertEquals("Each element should properly add to the list.",
                     list.size(), 1);
        final Object removed = list.remove(0);
        assertEquals("Each element should properly remove from the list.",
                     list.size(), 0);
        assertTrue("Each element should return the correct element " +
                   "on removal.",
                   removed == o);        
    }
}