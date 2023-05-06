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


public class CodexTest_0_5_73 { 
  @Test
    public void testRemoveObject_int() {
        Vector<Object> v = new Vector<Object>();
        v.add(new Object());
        v.add(new Object());
        v.add(new Object());
        v.add(new Object());
        v.remove(2);
        assertEquals(3, v.size());
        assertEquals(0, v.indexOf(v.get(0)));
        assertEquals(1, v.indexOf(v.get(1)));
        assertEquals(2, v.indexOf(v.get(2)));
    }
}