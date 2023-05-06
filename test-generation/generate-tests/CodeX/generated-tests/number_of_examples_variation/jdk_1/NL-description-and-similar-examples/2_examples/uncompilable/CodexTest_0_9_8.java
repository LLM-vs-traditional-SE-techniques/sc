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


public class CodexTest_0_9_8 { 
  @Test
  public void testRemove(){
	List<String> list = new ArrayList<String>();
	String[] input = {null, "", "how are you", "doing", "today"};
	String[] expected = {"how are you", null, "", "doing", "today"};
	for(String str : input){
		list.add(str);
	} 
	list.remove(1);    
	String[] result = new String[list.size()];
	for(int i = 0 ; i < list.size(); i ++){
		result[i] = list.get(i);
	}
	boolean res = true;
	for(int i = 0 ; i < expected.length ; i ++){
		if(expected[i] != resu
}