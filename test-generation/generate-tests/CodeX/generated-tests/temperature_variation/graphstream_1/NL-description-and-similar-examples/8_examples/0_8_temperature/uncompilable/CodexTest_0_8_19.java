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


public class CodexTest_0_8_19 { 
  @Test
    public void shouldContainEdgeEdge() {
        Edge e1 = context.mock(Edge.class, "e1");
        Edge e2 = context.mock(Edge.class, "e2");
        Edge e3 = context.mock(Edge.class, "e3");
        Edge e4 = context.mock(Edge.class, "e4");
        context.checking(new Expectations() {{
            exactly(1).of(e1).equals(e2); will(returnValue(false));
            exactly(1).of(e1).equals(e3); will(returnValue(false));
            exactly(1).of(e2).equals(e1); will(returnValue(false));
            exactly(1).of(e2).equals(e3); will(returnValue(false));
            exactly(1).of(e3).equals(e1); will(returnValue(false));
            exactly(1).of(e3).equals(e2); will(returnValue(false));
            exactly(1).of(e3).equals(e4); will(returnValue(true));
        }});
        path.add(e1);
        path.add(e2);
        path.add(e3);
        assertTrue(path.contains(e3));
        assertFalse(path.contains(e1));
        assertFalse(path.contains(e2));
        assertFalse(path.contains(e4));
        try {
            assertFalse(path.contains(null));
            fail("should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
}