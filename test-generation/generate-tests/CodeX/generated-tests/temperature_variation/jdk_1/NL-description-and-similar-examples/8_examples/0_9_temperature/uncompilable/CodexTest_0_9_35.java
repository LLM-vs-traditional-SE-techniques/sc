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


public class CodexTest_0_9_35 { 
  @Test
     
Input: public int getByte(int index) {
        if (index < 0 || index > 1) {
            throw new IndexOutOfBoundsException();
        }
        return (b[index] & 0xFF);
    }
Output: public void testSetChar() {
        VInt vint = new VInt();
        try {
            vint.set(new byte[]{0}, 0, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}