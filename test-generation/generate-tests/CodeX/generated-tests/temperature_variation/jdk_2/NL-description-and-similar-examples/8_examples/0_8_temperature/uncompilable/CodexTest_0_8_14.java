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


public class CodexTest_0_8_14 { 
  @Test
    public void testContainsObject() {
        assertTrue(list.contains(null));
        assertTrue(list.contains(new Integer(1)));
        assertFalse(list.contains(new Integer(17)));
        assertFalse(list.contains(new Object()));
    }

}