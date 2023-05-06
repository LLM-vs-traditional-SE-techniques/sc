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


public class CodexTest_0_8_61 { 
  @Test
  // This test takes a long time.
	public void testContains() {
        for (int i = 0; i < 1024; ++i) {
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {
                l.add(j);
            }
            assertTrue(l.contains(i - 1));
            assertTrue(l.contains(0));
            assertTrue(l.contains(null));
        }
    }
}