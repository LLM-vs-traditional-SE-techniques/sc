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


public class CodexTest_0_9_7 { 
  @Test
    public void testContains() {
        Object tooShortName = "NEW";
        assertFalse(m_names.contains(tooShortName));
        Object notPresentName = "HAS_SUCH_TRANSITION";
        assertFalse(m_names.contains(notPresentName));
        Object presentName = "NEW";
        assertTrue(m_names.contains(presentName));
    }
}