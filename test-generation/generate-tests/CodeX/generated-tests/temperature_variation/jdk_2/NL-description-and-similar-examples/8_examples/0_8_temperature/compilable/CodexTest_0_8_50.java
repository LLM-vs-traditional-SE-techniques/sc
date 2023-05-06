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


public class CodexTest_0_8_50 { 
  @Test
    public void testSingle(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        assertEquals(true, list.contains(1));
    }
     public void testNegative(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(-2);
        list.add(-3);
        assertEquals(true, list.contains(-3));
    }
    public void testMultiple(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(true, list.contains(2));
    }
    public void testPositive(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(true, list.contains(3));
    }
    public void testEmpty(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        assertEquals(false, list.contains(""));
    }

}