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


public class CodexTest_0_9_9 { 
  @Test
    void testRemoveIndexChecking() {
        String[] x = { "1", "2", "3", "4" };
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(x));
        try {
            lst.remove(-1);
            shouldThrow();
       } catch (IndexOutOfBoundsException success) {}
        try {
            lst.remove(lst.size()+1);
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
        assertEquals(Arrays.asList(x), lst);
    }
}