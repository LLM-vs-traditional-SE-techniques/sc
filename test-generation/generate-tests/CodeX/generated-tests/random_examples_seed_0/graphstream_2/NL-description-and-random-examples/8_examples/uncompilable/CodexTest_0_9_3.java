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


public class CodexTest_0_9_3 { 
  @Test
  public static void testEqualsPath() {
   Path path1=new Path(2);
    Path path2=new Path(2);
   path1.add(1);
  path2.add(1);
  System.out.println("path1.equals(path2) = "+path1.equals(path2));
}
}