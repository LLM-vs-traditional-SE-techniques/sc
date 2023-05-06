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


public class CodexTest_0_5_10 { 
  @Test
    public void testContains() {
        assertFalse(empty.contains(null));
        assertFalse(empty.contains("foo"));
        assertFalse(empty.contains(1));
        assertFalse(empty.contains(true));
        assertFalse(empty.contains(false));
        assertFalse(empty.contains(1.0));
        assertFalse(empty.contains(1.0f));
        assertFalse(empty.contains(1L));
        assertFalse(empty.contains(new Object()));
}