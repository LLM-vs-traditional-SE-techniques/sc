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


public class CodexTest_0_9_15 { 
  @Test
    public void testRemoveWithIterator() {
        java.util.ArrayList result = new java.util.ArrayList();
        java.util.ArrayList l = new java.util.ArrayList();
        l.add(new Integer(5));
        l.add(new Integer(2));
        l.add(new Integer(4));
        for (java.util.Iterator it = l.iterator(); it.hasNext(); ) {
            Integer item = (Integer) it.next();
            if (item.intValue() == 2) {
                it.remove();
            }
        }
        try {
            l.remove(0);
        } catch (IndexOutOfBoundsException e) {
            result.add("indexOutOfBoundsException");
        }
}