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


public class CodexTest_0_6_3 { 
  @Test
    public void testRemove() {
        String[] letters = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<String>();
        for (String letter : letters) {
            list.add(letter);
        }
        assertEquals("B", list.remove(1));
        assertEquals("D", list.remove(2));
        assertEquals("C", list.remove(1));
        assertEquals("A", list.remove(0));
    }
}