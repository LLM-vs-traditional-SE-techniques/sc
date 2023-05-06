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


public class CodexTest_0_9_2 { 
  @Test
    public void testNegativeIndexArgumentToRemove() {
        final int size = collection.size();
        for (int i = 0; i < size; i++) {
            try {
                collection.remove(-1);
            } catch (IndexOutOfBoundsException e) {}
            try {
                collection.remove(0);
            } catch (IndexOutOfBoundsException e) {}
        }
        try {
            collection.remove(-1);
            fail("expecting IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {}
    }
}