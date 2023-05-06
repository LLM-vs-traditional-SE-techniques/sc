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


public class CodexTest_0_5_39 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4"));
        for (int i = 0; i < list.size(); i++) {
            assertEquals(String.valueOf(i), list.remove(0));
        }
    }
}