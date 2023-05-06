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


public class CodexTest_0_5_9 { 
    @Test
    public void removeIndex() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 3, 1));
        list.remove(1);
        assertEquals(Arrays.asList(5, 3, 1), list);
        list.remove(0);
        assertEquals(Arrays.asList(3, 1), list);
        list.remove(1);
        assertEquals(Arrays.asList(3), list);
        list.remove(0);
        assertEquals(Arrays.asList(), list);
    }
}