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


public class CodexTest_0_4_9 { 
  @Test
    public void testContains() {
        assertFalse(BooleanUtils.toBooleanObject(null).contains(null));
        assertFalse(BooleanUtils.toBooleanObject(null).contains(Boolean.TRUE));
        assertFalse(BooleanUtils.toBooleanObject(null).contains(Boolean.FALSE));
        assertFalse(BooleanUtils.toBooleanObject(Boolean.TRUE).contains(null));
        assertTrue(BooleanUtils.toBooleanObject(Boolean.TRUE).contains(Boolean.TRUE));
        assertFalse(BooleanUtils.toBooleanObject(Boolean.TRUE).contains(Boolean.FALSE));
        assertFalse(BooleanUtils.toBooleanObject(Boolean.FALSE).contains(null));
        assertFalse(BooleanUtils.toBooleanObject(Boolean.FALSE).contains(Boolean.TRUE));
        assertTrue(BooleanUtils.toBooleanObject(Boolean.FALSE).contains(Boolean.FALSE));
    }
}