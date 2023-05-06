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


public class CodexTest_0_8_1 { 
    	@Test(expected = IndexOutOfBoundsException.class)
        public void removeLast_removeElement_shouldThrowIndexOutOfBoundsException() {
    		final FastArrayList<Integer> list = new FastArrayList<Integer>(new Integer[] {1, 2, 3});
            list.remove(10);
        }
}