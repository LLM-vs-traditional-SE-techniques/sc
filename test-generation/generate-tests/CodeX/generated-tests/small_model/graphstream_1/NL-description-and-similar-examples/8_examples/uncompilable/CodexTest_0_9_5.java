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


public class CodexTest_0_9_5 { 
  @Test
  public void testContains() {
    Line line1 = new Line();
    Line line2 = new Line();
    Edge edge1 = new Edge();
    edge1.set(line1.nodeA, line1.nodeB);
    Edge edge2 = new Edge();
    edge2.set(line2.nodeA, line2.nodeB);
}