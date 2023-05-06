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


public class CodexTest_0_8_9 { 
    @Test
    public void remove() {
        int len = 10;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            al.add(i);
        }
        for (int i = 0; i < len; i++) {
            assertEquals(al.remove(0), i);
        }
    }

}