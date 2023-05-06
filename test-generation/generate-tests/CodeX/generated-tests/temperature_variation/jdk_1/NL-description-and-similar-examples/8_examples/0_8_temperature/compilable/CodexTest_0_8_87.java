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


public class CodexTest_0_8_87 { 
  @Test
    public void testRemoveElementAtIndexOutOfBounds() {
        final List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1));
        try {
            list.remove(2);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }
}