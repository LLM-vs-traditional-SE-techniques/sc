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


public class CodexTest_0_5_4 { 
  @Test
        public void testRemove() {
            final int[] data = {1, 2, 3, 4, 5};
            final IntArrayList list = new IntArrayList(data);
            assertEquals(5, list.size());
            assertEquals(1, list.remove(0));
            assertEquals(5, list.size());
            assertEquals(2, list.remove(1));
            assertEquals(4, list.size());
            assertEquals(3, list.remove(2));
            assertEquals(3, list.size());
            assertEquals(4, list.remove(2));
            assertEquals(2, list.size());
            assertEquals(5, list.remove(1));
            assertEquals(1, list.size());
            assertEquals(5, list.remove(0));
            assertEquals(0, list.size());
        }
}