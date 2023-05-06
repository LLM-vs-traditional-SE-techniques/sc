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


public class CodexTest_0_6_5 { 
    @Test
    public void testContains() {
        assertFalse("Empty list should not contain anything", new LinkedList<Object>().contains("a"));
        assertFalse("List without target should not return true", list.contains("a"));
        assertTrue("List with target should return true", list.contains("b"));
        assertFalse("List with target but different type should return false", list.contains(1));
    }

}