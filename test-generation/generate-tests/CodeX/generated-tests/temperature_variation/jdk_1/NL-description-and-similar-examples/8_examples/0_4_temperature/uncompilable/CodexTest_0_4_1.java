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


public class CodexTest_0_4_1 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.remove(0);
        list.remove(list.size() - 1);
        list.remove(4);
        assertEquals("[1, 2, 3, 4, 6, 7, 8]", list.toString());
        try {
            list.remove(-1);
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
        try {
            list.remove(list.size());
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
    }
}