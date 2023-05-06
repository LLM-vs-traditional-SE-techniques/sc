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


public class CodexTest_0_9_57 { 
   @Test(expected = ListIndexOutOfBoundsException.class)
    public void testRemove_emptyList() {
        List<String> l = new ArrayList<>();
        try {
            l.remove(0);
        } catch (IndexOutOfBoundsException e) {
            fail("should throw ListIndexOutOfBoundsException");
        }
    }
}