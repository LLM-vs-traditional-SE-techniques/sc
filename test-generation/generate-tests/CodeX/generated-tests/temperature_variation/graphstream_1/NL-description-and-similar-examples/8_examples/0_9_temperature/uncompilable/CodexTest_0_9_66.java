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


public class CodexTest_0_9_66 { 
  @Test
  public void testContains() {
        int nbrEmployeesAll = 10;
        Employee ceo = new Employee(1, 1);
        Employee director = new Employee(2, 1);
        ceo.addReports(director);
        Edge e = new Edge(ceo, director);
        Graph graph = new DefaultGraph("Graph");
        graph.addEdge(e);
        Path path = new Path();
        assertFalse(path.isEmpty());
        assertEquals(0, path.size());
        assertFalse(path.contains(e));
        path.addEdge(e);
        assertTrue(path.contains(e));
    }
}