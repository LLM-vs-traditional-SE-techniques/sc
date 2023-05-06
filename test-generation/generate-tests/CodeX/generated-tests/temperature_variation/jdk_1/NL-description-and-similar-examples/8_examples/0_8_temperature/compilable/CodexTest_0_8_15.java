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


public class CodexTest_0_8_15 { 
  @Test
    public void testRemove() {
        ArrayList list = new ArrayList();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        assertEquals("Should be 0", list.remove(0), new Integer(0));
        assertEquals("Should be 1", list.remove(0), new Integer(1));
        assertEquals("Should be 2", list.remove(0), new Integer(2));
        assertEquals("Should be 3", list.remove(0), new Integer(3));
    }
}