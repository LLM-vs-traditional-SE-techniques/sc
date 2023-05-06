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


public class CodexTest_0_7_6 { 
  @Test
    public void testEquals() {
        Node n1 = mock(Node.class);
        Node n2 = mock(Node.class);
        Node n3 = mock(Node.class);
        Node n4 = mock(Node.class);
        Edge e1 = mock(Edge.class);
        Edge e2 = mock(Edge.class);
        Edge e3 = mock(Edge.class);
        Edge e4 = mock(Edge.class);
        Edge e5 = mock(Edge.class);
        when(e1.getTargetNode()).thenReturn(n1);
        when(e2.getTargetNode()).thenReturn(n2);
        when(e3.getTargetNode()).thenReturn(n3);
        when(e4.getTargetNode()).thenReturn(n4);
        when(e5.getTargetNode()).thenReturn(n1);
        Path p1 = new Path();
        p1.add(n1);
        p1.add(e1);
        p1.add(n2);
        p1.add(e2);
        p1.add(n3);
        p1.add(e3);
        p1.add(n4);
        Path p2 = new Path();
        p2.add(n1);
        p2.add(e1);
        p2.add(n2);
        p2.add(e2);
        p2.add(n3);
        p2.add(e3);
        p2.add(n4);
        Path p3 = new Path();
        p3.add(n1);
        p3.add(e1);
        p3.add(n2);
        p3.add(e2);
        p3.add(n3);
        p3.add(e4);
        p3.add(n4);
        Path p4 = new Path();
        p4.add(n1);
        p4.add(e1);
        p4.add(n2);
        p4.add(e2);
        p4.add(n
}