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


public class CodexTest_0_7_95 { 
  @Test
    public void testRemove_int() {
        // remove from middle
        Object obj = "";
        list.add(obj);
        list.add("");
        list.add("");
        list.add("");
        list.remove(1);
        assertSame(obj, list.get(0));
        assertEquals(3, list.size());
    }
}