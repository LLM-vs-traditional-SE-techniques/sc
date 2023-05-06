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


public class CodexTest_0_7_9 { 
        @Test
        public void testRemoveMiddle() {
            List<String> list = new ArrayList<>(Arrays.asList(a, b, c, d, e));
            list.remove(2);
            assertEquals(4, list.size());
            assertEquals(a, list.get(0));
            assertEquals(b, list.get(1));
            assertEquals(d, list.get(2));
            assertEquals(e, list.get(3));
        }
}