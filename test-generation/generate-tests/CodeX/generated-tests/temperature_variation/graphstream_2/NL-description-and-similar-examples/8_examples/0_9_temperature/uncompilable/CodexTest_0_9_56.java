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


public class CodexTest_0_9_56 { 
  @Test
        public void notEquals() {
            Path path1 = new Path();
            Node nodeA = new DefaultNode("A");
            Node nodeB = new DefaultNode("B");
            Node nodeC = new DefaultNode("C");
            Node nodeD = new DefaultNode("D");
            Edge edge1 = new DefaultEdge("A-B");
            Edge edge2 = new DefaultEdge("B-C");
            Edge edge3 = new DefaultEdge("C-D");
            path1.setRoot(nodeA);
            path1.add(edge1);
            path1.add(edge2);
            path1.add(edge3);
}