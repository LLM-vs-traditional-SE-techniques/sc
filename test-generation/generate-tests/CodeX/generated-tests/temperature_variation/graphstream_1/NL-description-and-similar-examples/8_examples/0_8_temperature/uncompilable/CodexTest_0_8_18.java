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
    public void testContainsReturnsTrueWhenInBoth() {
        // given
        DefaultEdgePath<String, DefaultEdge> underTest = new DefaultEdgePath<>(null);
        DefaultEdge edge = new DefaultEdge("A", "B");
        underTest.add(edge);
        // when
        boolean result = underTest.contains(edge);
        // then
        assertTrue(result);
    }
}