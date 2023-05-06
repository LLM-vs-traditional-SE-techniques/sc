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


public class CodexTest_0_7_69 { 
  @Test
    public void testRemove_int() {
        Object o = new Object();
        FixedArrayList<Object> a = new FixedArrayList<Object>(new Object[] {o,o,o});
        try {
            a.remove(3);
            fail("Expecting IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}