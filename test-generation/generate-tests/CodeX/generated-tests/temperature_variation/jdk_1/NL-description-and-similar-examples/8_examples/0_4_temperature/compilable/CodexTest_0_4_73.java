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


public class CodexTest_0_4_73 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(new Integer(0));
        a.add(new Integer(1));
        a.add(new Integer(2));
        a.add(new Integer(3));
        a.add(new Integer(4));
        a.add(new Integer(5));
        a.add(new Integer(6));
        a.add(new Integer(7));
        a.add(new Integer(8));
        a.add(new Integer(9));
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
    }
}