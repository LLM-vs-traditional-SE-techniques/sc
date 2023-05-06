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


public class CodexTest_0_9_16 { 
  @Test
    public void testMove() {
        WrappedList list = new WrappedList(new ArrayList());
        
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        
        list.move(3, 1);
        
        assertTrue("1st element is null", list.get(0) != null);
        assertTrue("2nd element is null", list.get(1) != null);
        assertTrue("3rd element is null", list.get(2) != null);
        assertTrue("4th element is null", list.get(3) != null);
        assertTrue("5th element is null", list.get(4) != null);
        assertTrue("6th element is null", list.get(5) != null);
        assertTrue("7th element is null", list.get(6) != null);
        assertTrue("8th element is null", list.get(7) != null);
    }
}