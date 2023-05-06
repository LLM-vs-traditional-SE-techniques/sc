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


public class CodexTest_0_8_96 { 
  @Test
        @SuppressWarnings("unchecked")
        public void testIndexOf() {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(1); al.add(3); al.add(5); al.add(7); al.add(9);
            assertEquals(1, (int) al.remove(1));
            assertEquals(2, al.size());
            assertEquals(1, (int) al.get(0));
            assertEquals(5, (int) al.get(1));
        }
}