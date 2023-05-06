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


public class CodexTest_0_9_78 { 
  @Test
     public void testContainsFalse() {
        Object o = new Object();
        assertFalse(new CustomCollection<Object>(o).contains(new Object()));
    }
Input: public boolean indexOf(Object o) {
        return o.equals(e);
    }
Output:
    public void testIndexOfOne() {
        assertEquals(0, new CustomList<Object>(new Object()).indexOf(new Object()));
    }
}