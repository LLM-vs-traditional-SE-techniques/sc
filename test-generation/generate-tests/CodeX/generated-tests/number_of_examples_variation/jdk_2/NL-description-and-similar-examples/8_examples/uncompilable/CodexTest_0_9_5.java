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


public class CodexTest_0_9_5 { 
  @Test
    public void testContainsObject() {
        String object1 = "1";
        String object2 = "2";
        BindingMap sut = new BindingMap();
        // Exercize system
        boolean result = sut.contains(object1);
        // Verify outcome
        assertEquals(false, result);
    }
}