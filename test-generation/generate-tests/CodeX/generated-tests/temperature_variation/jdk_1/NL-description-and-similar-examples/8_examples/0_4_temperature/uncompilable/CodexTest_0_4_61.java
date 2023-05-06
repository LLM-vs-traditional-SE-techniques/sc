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


public class CodexTest_0_4_61 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], list.get(i));
        }
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], list.remove(0));
        }
    }
}