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


public class CodexTest_0_9_92 { 
  @Test
    public void test_remove_0() {
        List<String> empty = createEmpty();
        try {
            empty.remove(0);
            fail("throws IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
	}
}