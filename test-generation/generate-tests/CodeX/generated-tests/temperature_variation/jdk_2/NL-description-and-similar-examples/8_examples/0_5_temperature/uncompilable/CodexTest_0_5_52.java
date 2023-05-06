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


public class CodexTest_0_5_52 { 
  @Test
    public void testContains() {
        assertFalse(list.contains(null));
        assertFalse(list.contains(new Object()));
        assertFalse(list.contains(Boolean.TRUE));
        assertTrue(list.contains(Boolean.FALSE));
        assertFalse(list.contains(Boolean.TRUE));
        list.add(Boolean.TRUE);
        assertTrue(list.contains(Boolean.TRUE));
    }
}