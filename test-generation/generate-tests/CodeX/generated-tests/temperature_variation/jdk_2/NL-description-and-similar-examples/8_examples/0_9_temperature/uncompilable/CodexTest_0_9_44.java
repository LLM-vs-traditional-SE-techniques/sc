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


public class CodexTest_0_9_44 { 
  @Test
    public void testContains() {
        assertTrue("[4, 3, 2, 1, 0] contains 2", set.contains(2)); //$NON-NLS-1$
        assertFalse("[4, 3, 2, 1, 0] should not contain 6", set.contains(6)); //$NON-NLS-1$
    }
}