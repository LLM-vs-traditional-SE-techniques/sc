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


public class CodexTest_0_5_95 { 
  @Test
    public void testRemoveIndex() {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        assertTrue(v.remove(0) == 1);
        assertTrue(v.isEmpty());
        try {
            v.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e) {
        }
    }
}