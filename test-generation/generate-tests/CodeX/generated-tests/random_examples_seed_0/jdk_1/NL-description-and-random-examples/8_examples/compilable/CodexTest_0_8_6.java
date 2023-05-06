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


public class CodexTest_0_8_6 { 
    @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        Integer old = list.remove(1);
        assertEquals(6, old.intValue());
        assertEquals(2, list.size());
        assertEquals(5, list.get(0).intValue());
        assertEquals(7, list.get(1).intValue());
    }
}