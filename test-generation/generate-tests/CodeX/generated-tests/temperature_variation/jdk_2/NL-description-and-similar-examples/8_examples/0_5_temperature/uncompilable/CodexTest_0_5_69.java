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


public class CodexTest_0_5_69 { 
  @Test
    public void testContainsObject() {
        AlgVector v = new AlgVector(3);
        assertFalse("Contains null", v.contains(null));
        assertFalse("Contains wrong type", v.contains(new Object()));
        assertFalse("Contains wrong value", v.contains(new Double(3.0)));
}