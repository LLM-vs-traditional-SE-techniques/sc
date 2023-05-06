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


public class CodexTest_0_3_4 { 
    @Test
    public void testRemove() {
        // given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // when
        String removed = list.remove(1);
        // then
        assertEquals("b", removed);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(1));
    }
}