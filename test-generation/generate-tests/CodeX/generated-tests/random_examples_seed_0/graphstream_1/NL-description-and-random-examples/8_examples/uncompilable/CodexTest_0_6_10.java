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


public class CodexTest_0_6_10 { 
  @Test
    public void testContains() {
        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(1, 2));
        edgeList.add(new Edge(2, 3));
        edgeList.add(new Edge(2, 4));
        edgeList.add(new Edge(6, 1));
        edgeList.add(new Edge(5, 4));
        edgeList.add(new Edge(3, 5));
        edgeList.add(new Edge(3, 7));
        edgeList.add(new Edge(6, 7));
}