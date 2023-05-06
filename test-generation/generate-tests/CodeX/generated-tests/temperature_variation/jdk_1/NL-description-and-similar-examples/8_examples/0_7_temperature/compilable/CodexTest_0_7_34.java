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


public class CodexTest_0_7_34 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.remove(0);
        assertEquals(2, al.size());
        assertEquals(2, al.get(0).intValue());
        al.remove(1);
        assertEquals(1, al.size());
        assertEquals(2, al.get(0).intValue());
        al.remove(0);
        assertEquals(0, al.size());
    }
}