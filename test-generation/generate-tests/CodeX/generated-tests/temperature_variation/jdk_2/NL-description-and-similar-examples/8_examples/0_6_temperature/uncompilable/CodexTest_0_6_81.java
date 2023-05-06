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


public class CodexTest_0_6_81 { 
  @Test
    public void testContains() {
        assertFalse(q.contains(null));
        assertFalse(q.contains(new Object()));
        assertFalse(q.contains("Hello"));
        assertFalse(q.contains(5));
        assertFalse(q.contains(5.0));
        assertFalse(q.contains(5.0f));
        assertFalse(q.contains(this));
        assertFalse(q.contains(new Integer(5)));
    }
}