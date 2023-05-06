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


public class CodexTest_0_9_10 { 
  @Test
    public void testRemove(){
        int expectedElementsSize = 4;
        
        List<Object> list = new MyList() {
        };
        
        list.add("Test");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        
        list.remove(2);
        
        assertEquals("Test", list.get(1));
        assertEquals("Test4", list.get(2));
        
    }
 */
public interface INameFinder {
	
	/**
	 * Unigram
	 * @param element
	 * @return
	 */
	public String[] unigram(String element);
	
	/**
	 * Bigram
	 * @param element
	 * @return
	 */
	public String[] bigram(String element);
	
	/**
	 * Trigram
	 * @param elemen
}