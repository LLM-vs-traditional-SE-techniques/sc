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


public class CodexTest_0_9_25 { 
  @Test
   public void test_index_ordinal_1() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        Object o = a.remove(0);
        assertEquals(10, o);
        assertEquals(0, a.size());
    }
	
Input: public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
Output: public void test_hasNext_next_remove() {
        ArrayList<String> a = new ArrayList<>();
        a.add("nine");
        a.add("ten");
        for (Iterator<String> i = a.iterator(); i.hasNext();) {
            String s = i.next();
            if (s.equals("ten")) {
                i.remove();
            }
        }
        assertEquals(1, a.size());
        assertEquals("nine", a.get(0));
    }
}