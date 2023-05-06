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


public class CodexTest_0_9_19 { 
  @Test
        public void remove() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        int removed = a.remove(0);
        assertEquals(Integer.valueOf(1), Integer.valueOf(removed));
        assertEquals(Arrays.asList(2, 3), a);
    }
}