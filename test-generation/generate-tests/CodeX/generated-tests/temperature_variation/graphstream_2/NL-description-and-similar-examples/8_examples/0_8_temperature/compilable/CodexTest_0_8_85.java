import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_85 { 
  @Test
   public static void intTest19() {
      int[] nums = {1,2,3,4,5};
      Integer[] ints = {1,2,3,4,5};
      int[] nums2 = {1,2,3,4,5};
      Integer[] ints2 = {1,2,3,4,5};
      
      System.out.println(nums.equals(ints));
      System.out.println(ints.equals(nums));
      System.out.println(nums.equals(nums2));
      System.out.println(ints.equals(ints2));
   }
}