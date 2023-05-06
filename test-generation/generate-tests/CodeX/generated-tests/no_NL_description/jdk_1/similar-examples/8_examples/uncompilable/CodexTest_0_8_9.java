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
    @Test public void subListBounds() {
        ArrayList<String> list = new ArrayList<>();
        final List<String> sub = list.subList(0, 0);
        Runnable r = () -> sub.remove(0);
        assertThrows(IndexOutOfBoundsException.class, r);
    }
}