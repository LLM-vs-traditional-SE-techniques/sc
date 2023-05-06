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


public class CodexTest_0_7_78 { 
  @Test
    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("0");
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");
        strList.add("6");
        System.out.println(strList.remove(0));
        System.out.println(strList.remove(1));
        System.out.println(strList.remove(2));
        System.out.println(strList.remove(3));
        System.out.println(strList.remove(4));
        System.out.println(strList.remove(5));
        System.out.println(strList.remove(6));
    }
}