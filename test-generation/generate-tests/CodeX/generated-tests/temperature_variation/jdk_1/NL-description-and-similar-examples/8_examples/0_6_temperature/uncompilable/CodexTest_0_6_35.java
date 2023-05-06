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


public class CodexTest_0_6_35 { 
  @Test
    public void testRemove() {
        SimpleList list = new SimpleList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(2, list.size());
        
        list.remove(1);
        assertEquals(1, list.get(0));
        assertEquals(1, list.size());
        
        list.add(new Integer(2));
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(2, list.size());
        
        list.remove(1);
        assertEquals(1, list.get(0));
        assertEquals(1, list.size());
        
        list.remove(0);
        assertEquals(0, list.size());
    }
}