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


public class CodexTest_0_9_60 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 100; i++) {
            Vector v = new Vector();
            for (int j = 0; j < 100; j++) {
                v.add(new Integer(1000 + j));
            }
            Integer t = new Integer(1);
            for (int j = 0; j < 100; j++) {
                v.add(t);
            }
            int l = v.size();
            for (int j = 0; j < 100; j++) {
                assertTrue(v.remove(t));
                assertEquals(--l, v.size());
            }
            v.clear();
        }
    }
}