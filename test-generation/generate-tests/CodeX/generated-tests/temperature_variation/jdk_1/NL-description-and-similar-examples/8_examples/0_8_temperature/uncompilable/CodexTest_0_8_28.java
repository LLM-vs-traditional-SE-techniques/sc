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


public class CodexTest_0_8_28 { 
  @Test
    public void testAppend() {
        assertEquals(0, this.create().size());
        assertEquals(1, this.create().append(Integer.valueOf(1)).size());
        assertEquals(2, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).size());
        assertEquals(3, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).append(Integer.valueOf(3)).size());
        assertEquals(1, this.create().append(Integer.valueOf(1)).remove(0).size());
        assertEquals(2, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).remove(0).size());
        assertEquals(2, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).remove(1).size());
        assertEquals(1, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).remove(0).remove(0).size());
        assertEquals(0, this.create().append(Integer.valueOf(1)).append(Integer.valueOf(2)).remove(0).remove(0).remove(0).size());
}