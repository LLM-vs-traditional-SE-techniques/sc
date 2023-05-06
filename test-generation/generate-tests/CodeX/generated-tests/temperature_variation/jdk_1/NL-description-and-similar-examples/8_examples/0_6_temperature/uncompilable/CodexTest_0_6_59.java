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


public class CodexTest_0_6_59 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < v.size(); i++) {
            v.remove(i);
            assertEquals(v.toString(), v.size(), v.capacity());
            assertEquals(v.toString(), v.size(), v.cardinality());
            assertEquals(v.toString(), v.size(), v.getSizeInBytes());
            if (i < v.size()) {
                assertTrue(v.toString(), v.contains(i));
            }
        }
    }
}