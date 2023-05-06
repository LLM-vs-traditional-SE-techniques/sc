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


public class CodexTest_0_7_1 { 
    @Test
    public void testRemove() {
        ListIterator<String> iter = list.listIterator(1);
        iter.next();
        iter.remove();
        assertEquals(1, list.size());
        assertEquals(b, list.get(0));
        assertEquals(b, list.get(1));
    }
}