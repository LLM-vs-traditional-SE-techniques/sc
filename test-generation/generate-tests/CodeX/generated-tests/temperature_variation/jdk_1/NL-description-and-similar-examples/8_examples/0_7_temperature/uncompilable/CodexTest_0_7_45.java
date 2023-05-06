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


public class CodexTest_0_7_45 { 
  @Test
    public void testRemoveInt() {
        ArrayList<String> a = populatedArrayList( "A", "B", "C", "D", "E", "F" );
        assertEquals("C",a.remove(2));
        assertEquals("[A, B, D, E, F]", a.toString());
    }
}