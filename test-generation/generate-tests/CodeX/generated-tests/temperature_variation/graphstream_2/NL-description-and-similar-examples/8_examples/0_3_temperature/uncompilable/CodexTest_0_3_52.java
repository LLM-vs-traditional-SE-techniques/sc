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


public class CodexTest_0_3_52 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("A"));
        p1.add(new Node("B"));
        p2.add(new Node("A"));
        p2.add(new Node("B"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("C"));
        p2.add(new Node("C"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("D"));
        p2.add(new Node("D"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("E"));
        p2.add(new Node("E"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("F"));
        p2.add(new Node("F"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("G"));
        p2.add(new Node("G"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("H"));
        p2.add(new Node("H"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Node("I"));
        p2.add(new Node("I"));
        assertTrue(p1.equals(p2));
       
}