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


public class CodexTest_0_7_1 { 
  @Test
     public void testContains() throws Exception {
        Edge e1 = new Edge(1, 2, 1, 1);
        Edge e2 = new Edge(2, 3, 1, 1);
        Edge e3 = new Edge(3, 4, 1, 1);
        Edge e4 = new Edge(4, 5, 1, 1);
        ArrayList<Edge> list = new ArrayList<Edge>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        EdgePath ep = new EdgePath(list);
        assertEquals(true, ep.contains(e2));
    }
}