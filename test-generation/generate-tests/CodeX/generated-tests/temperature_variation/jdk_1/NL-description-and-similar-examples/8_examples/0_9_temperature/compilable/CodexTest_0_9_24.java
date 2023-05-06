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


public class CodexTest_0_9_24 { 
  @Test
    public void testRemove(){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Object o = list.remove(2);
        assertSame(o, new Integer(3));
        assertEquals(list, Arrays.asList(new Integer[]{1,2,4,5}));
    }
}