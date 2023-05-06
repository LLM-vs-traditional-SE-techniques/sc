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


public class CodexTest_0_7_10 { 
  @Test
    public void testRemoveWithInvalidIndex() {
        try {
            list.remove(3);
            fail("Test should fail for invalid index");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Invalid index: 3", e.getMessage());
        }
    }
}