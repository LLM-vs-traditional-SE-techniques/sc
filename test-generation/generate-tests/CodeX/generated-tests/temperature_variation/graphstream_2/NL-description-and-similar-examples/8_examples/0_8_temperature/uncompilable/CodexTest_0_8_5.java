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


public class CodexTest_0_8_5 { 
  @Test
        public void testEdgeList() {
        Node a = new Node(a);
        Node b = new Node(b);
        Node c = new Node(c);
        Edge ab = new Edge(ab,a,b,0);
        Edge bc = new Edge(bc,b,c,0);
        EdgeList e = new EdgeList();
        e.add(ab);
        e.add(bc);
        Assert.assertFalse(e.equals(null));
        Assert.assertFalse(e.equals(new ArrayList()));
        }
}