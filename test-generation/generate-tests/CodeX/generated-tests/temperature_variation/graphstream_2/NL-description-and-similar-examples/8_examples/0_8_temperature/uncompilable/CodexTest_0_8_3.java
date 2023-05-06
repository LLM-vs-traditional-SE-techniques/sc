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


public class CodexTest_0_8_3 { 
  @Test
         public void testEqualsWithFalse() {
            Path path1 = new Path();
            Path path2 = new Path();
            Node node1 = new DefaultNode("1");
            Node node2 = new DefaultNode("2");
            Node node3 = new DefaultNode("3");
            Node node4 = new DefaultNode("4");
            path1.add(node1);
            path1.add(node2);
            path2.add(node3);
            path2.add(node4);
}