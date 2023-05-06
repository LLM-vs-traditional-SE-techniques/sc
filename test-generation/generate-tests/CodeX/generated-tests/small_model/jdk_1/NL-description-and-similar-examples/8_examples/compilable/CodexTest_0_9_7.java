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


public class CodexTest_0_9_7 { 
  @Test
    public void testSparseArrayEqualHash() {
        int[] first = new int[2];
        int[] second = new int[2];
        assertArrayEquals(first, second);
        assertArrayEquals(first, second);
    }
}