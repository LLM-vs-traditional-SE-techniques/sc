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


public class CodexTest_0_8_91 { 
  @Test
        public int testObjectArrayRemoveMiddle() {
        Object[] array = { "One", "Two", "Three", "Four", "Five" };
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        assertEquals("Removed", "Three", arrayList.remove(2));
        assertEquals("Size dec", 4, arrayList.size());
        assertEquals("Removed", "Four", arrayList.remove(2));
        assertEquals("Size dec", 3, arrayList.size());
        return 0;
    }
}