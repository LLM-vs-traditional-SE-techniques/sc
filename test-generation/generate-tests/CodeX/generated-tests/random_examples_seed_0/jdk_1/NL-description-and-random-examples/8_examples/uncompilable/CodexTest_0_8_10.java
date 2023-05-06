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


public class CodexTest_0_8_10 { 
  @Test
    //failing test case
    public void testRemove() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int expected = arr.get(3);
        int actual = (int) arr.remove(3);
        assertEquals(expected, actual);
}