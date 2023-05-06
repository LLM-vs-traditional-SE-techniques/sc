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


public class CodexTest_0_9_8 { 
  @Test
    public void testRemove() {
        DoubleArrayList v = new DoubleArrayList(new double[] {2,3,5,7,11,13,17,23});
        assertEquals(11.0, v.remove(4), 0.0);
        assertEquals(new DoubleArrayList(new double[] {2,3,5,7,13,17,23}), v);
        for (int i=9; i>=0; i--) {
            v.remove(i % v.size());
        }
        assertEquals(new DoubleArrayList(), v);
    }
}