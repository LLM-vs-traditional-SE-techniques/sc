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


public class CodexTest_0_8_8 { 
    @Test
    public void testContains() {
        final int[] numbers = {-1, 0, 1, 2, 3, 5, 8, 13};
        final Set set = new HashSet();
        for (int i = 0; i != numbers.length; set.add(new Integer(numbers[i++])));
        assertTrue("-1 is missing", set.contains(new Integer(-1)));
        assertTrue("0 is missing", set.contains(new Integer(0)));
        assertTrue("8 is missing", set.contains(new Integer(8)));
        assertFalse("4 is not missing", set.contains(new Integer(4)));
    }
}