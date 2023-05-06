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


public class CodexTest_0_9_73 { 
  @Test
        public void testContaints() {
        List<String> list = new LinkedList<>(List.of("a", "b", "c", "d"));
        assertTrue("List should contain b", list.contains("b"));
        assertFalse("List should not contain 5", list.contains("5"));
    }
}