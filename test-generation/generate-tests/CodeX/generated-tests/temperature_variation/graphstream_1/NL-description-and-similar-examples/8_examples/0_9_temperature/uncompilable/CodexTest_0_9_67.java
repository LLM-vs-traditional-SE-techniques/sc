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


public class CodexTest_0_9_67 { 
  @Test
    public void testContains() {
		Edge e1 = Graphs.createDirectedSimpleEdge(0, 1);
		Edge e2 = Graphs.createDirectedSimpleEdge(1, 2);
		Edge e3 = Graphs.createDirectedSimpleEdge(0, 1);
}