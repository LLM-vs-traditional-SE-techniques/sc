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


public class CodexTest_0_9_79 { 
    @Test
    public void testRemoveEmptyList() {
        final int[] source = { };
        final List<Integer> list = makePopulatedList(source);
        try {
            list.remove(0);
            fail("Expecting IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
}