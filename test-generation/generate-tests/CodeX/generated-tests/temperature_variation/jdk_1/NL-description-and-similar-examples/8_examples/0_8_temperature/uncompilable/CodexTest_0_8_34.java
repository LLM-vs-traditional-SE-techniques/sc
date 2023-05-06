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


public class CodexTest_0_8_34 { 
  @Test
        public void testInteger() {
            final List<Integer> list = new SparseList<Integer>(Integer.class);
            final int size = 10;
            for (int i = 0; i < size; i++) {
                list.add(Integer.valueOf(i + 1));
            }
}