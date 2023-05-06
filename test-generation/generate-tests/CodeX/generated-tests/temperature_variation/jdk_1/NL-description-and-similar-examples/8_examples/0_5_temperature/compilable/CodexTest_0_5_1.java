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


public class CodexTest_0_5_1 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.remove(3);
        assertEquals(9, al.size());
        assertEquals((Integer)1, al.get(0));
        assertEquals((Integer)2, al.get(1));
        assertEquals((Integer)3, al.get(2));
        assertEquals((Integer)5, al.get(3));
        assertEquals((Integer)6, al.get(4));
        assertEquals((Integer)7, al.get(5));
        assertEquals((Integer)8, al.get(6));
        assertEquals((Integer)9, al.get(7));
        assertEquals((Integer)10, al.get(8));
    }
}