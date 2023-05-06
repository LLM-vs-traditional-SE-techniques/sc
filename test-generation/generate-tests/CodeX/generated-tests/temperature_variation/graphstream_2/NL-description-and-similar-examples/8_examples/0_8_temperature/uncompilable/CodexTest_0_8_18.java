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


public class CodexTest_0_8_18 { 
  @Test
  public void testDifferentContainers() {
        // given
        Path path = new Path();
        path.setRoot(nodes.get(a));
        path.add(nodes.get(a).getEdge(ab));
        path.add(nodes.get(b).getEdge(bc));
        // when
        Path path2 = new Path();
        path2.setRoot(nodes.get(a));
        path2.add(nodes.get(a).getEdge(ab));
        path2.add(nodes.get(b).getEdge(bc));
        // then
        assertTrue(path.equals(path2));
        // when
        path2.setRoot(nodes.get(b));
        // then
        assertFalse(path.equals(path2));
    }
}